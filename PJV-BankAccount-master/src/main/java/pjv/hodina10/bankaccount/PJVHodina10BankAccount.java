package pjv.hodina10.bankaccount;

import java.util.ArrayList;
import java.util.List;


public class PJVHodina10BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        List<Person> persons = createPersons();
        
        double [] payments = new double[]{1, 2, 3, 1, 2, 3, 5, 3, 2};

        Work work = new Work(persons, payments);
        Shop shop = new Shop(persons, payments);
        
        work.payPayments();
        shop.makeCustomersPayBills();

        Shop.t.join();
        Work.t.join();
        printPersons(persons);
    }
    
    private static List<Person> createPersons(){
        List<Person> persons = new ArrayList<>(10);
        for(int i = 0; i < 10; i++){
            Person person  = new Person(new BankAccount(0), i);
            persons.add(person);
        }
        return persons;
    }
    
    private static void printPersons(List<Person> persons){
        for(Person person : persons){
            System.out.println(person.toString());
        }
    }
    
}
