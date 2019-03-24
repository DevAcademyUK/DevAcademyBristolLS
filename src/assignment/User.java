package assignment;

//This is a class for User

public class User {
    private BankAccount current = new BankAccount();
    private BankAccount savings = new BankAccount();
    private BankAccount joint = new BankAccount();
    public String name;
    public String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public BankAccount getCurrentAccount(){

        return current;
    }

    public BankAccount getSavingsAccount(){
        return savings;
    }
    public BankAccount getJointAccount(){
        return joint;
    }
}

