/**
 * Interface 
 */
interface BankAccount{
    void creditIntrest();
}
class UserAccount implements BankAccount{
    int balance = 1000;
    public void creditIntrest(){
        balance += (balance*7)/100;
        System.out.println(balance);
    }
}
public class Lecture12{
    public static void main(String[] args) {
        BankAccount a1 = new UserAccount();
        a1.creditIntrest();
    }
}
