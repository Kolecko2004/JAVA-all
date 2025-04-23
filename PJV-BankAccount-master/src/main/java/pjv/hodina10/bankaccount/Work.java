package pjv.hodina10.bankaccount;

import java.util.List;


public class Work {
    private final List<Person> employees;
    public final double [] payments;
    static public Thread t;
    
    public Work(List<Person> employees, double [] payments){
        this.employees = employees;
        this.payments = payments;
    }
    
    public void payPayments() throws InterruptedException{
        for(Person employee : employees){
            for(double payment : payments){
                t = new Thread((new Runnable() {
                    @Override
                    public void run() {
//                        System.out.println(employee + "thread started");
                        try {
                            employee.addAmountToBankAccount(payment);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
//                        System.out.println(employee + "thread ended");
                    }
                }));
                t.start();
            }
        }
    }

}
