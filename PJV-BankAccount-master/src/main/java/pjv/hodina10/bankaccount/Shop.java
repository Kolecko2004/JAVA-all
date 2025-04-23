
package pjv.hodina10.bankaccount;

import java.util.List;


public class Shop {
    static public Thread t;
    List<Person> customers;
    double [] bills;
    
    
    public Shop(List<Person> customers, double [] bills){
        this.customers = customers;
        this.bills = bills;
    }
    
    public void makeCustomersPayBills() throws InterruptedException{
         for(Person customer : customers){
            for(double payment : bills){
                t = new Thread(() -> {
                    System.out.println("Shop start");
                    try {
                        customer.removeAmountFromBankAccount(payment);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Shop end");
                });
                t.start();
            }
        }
    }
    
}
