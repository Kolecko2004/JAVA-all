package pjv.hodina10;

public class MyStack implements Stack{
    private final int length = 3;
    private final String[] data = new String[length];
    private int count = 0;

    @Override
    synchronized public void add(String word) {
        while (isFull()) {
            try {
                //System.out.println("Stack is empty and is waiting to pop and is calling wait()");
                wait();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        data[count] = word;
        count++;
        notifyAll();
    }

    @Override
    synchronized public String pop() throws InterruptedException {
        while (isEmpty()) {
            //System.out.println("Stack is empty and is waiting to pop");
            wait();
        }

        data[--count] = null;
        notifyAll();
        return "Was removed";
    }

    @Override
    synchronized public boolean isEmpty() {
        return (count == 0);
    }

    synchronized private boolean isFull() {
        return (count == length);
    }
}
