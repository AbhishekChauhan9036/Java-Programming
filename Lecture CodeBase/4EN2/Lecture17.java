interface BankAccount{
    void creditInterest();
}
class CustomerAccount implements BankAccount{
    int balance=1000;
    public void creditInterest(){
        balance+=(balance*10)/100;
    }
    public void printDetails(){
        System.out.println(balance);
    }
}
public class Lecture17{
    public static void main(String[] args){
        CustomerAccount c1 = new CustomerAccount();
        c1.creditInterest();
        c1.printDetails();
    }
}