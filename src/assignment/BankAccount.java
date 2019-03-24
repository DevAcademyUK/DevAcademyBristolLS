package assignment;

//This is a class for Bank Account

public class BankAccount {
    private float balance;

    public void makeDeposit(float amount){
        balance = balance + amount;
    }

    public void withdraw(float amount){
        balance = balance - amount;
    }

    public float checkBalance(){
        return balance;
    }
}