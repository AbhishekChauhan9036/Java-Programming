class InstaAccount{
    private String username;
    private String password;
    public String bio;
    public void setter(String username,String password, String bio){
        this.username = username;
        this.password = password;
        this.bio = bio;
    }
    public void getter(){
        System.out.println("User Name: "+this.username);
        System.out.println("User Password: "+this.password);
        System.out.println("User Bio: "+this.bio);
    }
}

public class Lecture9_2{
    public static void main(String[] args){
        InstaAccount i1 = new InstaAccount();
        i1.setter("gauarv89","Marwadi8031@%&*","Freelancer");
        i1.getter();
    }
}