/**
 * Interface
 */
interface BankAccount{
    void creditIntrest();
    void print();
}
class CustomerAccount implements BankAccount{
    int balance = 1000;
    public void creditIntrest(){
        balance+= (balance*10)/100;
    }
    public void print(){
        System.out.println(balance);
    }
}
public class Lecture13{
    public static void main(String[] args){
        BankAccount c1 = new CustomerAccount();
        c1.creditIntrest();
        c1.print();
    }
}