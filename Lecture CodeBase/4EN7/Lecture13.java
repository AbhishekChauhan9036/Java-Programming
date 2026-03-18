interface BankAccount{
    void creditIntrest();
}
class CustomerAccount implements BankAccount{
    int balance = 100;
    public void creditIntrest(){
        balance += (balance * 10)/100;
        System.out.println(balance);
    }
}
public class Lecture13{
    public static void main(String[] args){
        CustomerAccount c1 = new CustomerAccount();
        c1.creditIntrest();
    }
}