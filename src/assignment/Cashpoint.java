package assignment;

import java.util.Scanner;

public class Cashpoint {
    private User vasya = new User("Vasya", "1234567");

    public boolean login(String name, String password){
        if (name.equals(vasya.name) && password.equals(vasya.password)){
            return true;
        } else {
            return false;
        }
    }

    public void init() {
        System.out.println("Input user name: ");
        String username = new Scanner(System.in).next();
        System.out.println("Input your password: ");
        String password = new Scanner(System.in).next();

        boolean isAuthorized = login(username, password);

        if(isAuthorized){
            System.out.println("Hooray! Authorized successfully!");
            chooseAccount();
        }else{
            System.out.println("Error! Wrong name or password");
            init();
        }
    }

    private void chooseAccount() {
        System.out.println("Which account do you want to work on? current(1)/savings(2)/joint(3)");
        int accountType = new Scanner(System.in).nextInt();
        switch (accountType) {
            case 1:
                chooseOperation(vasya.getCurrentAccount());
                break;
            case 2:
                chooseOperation(vasya.getSavingsAccount());
                break;
            case 3:
                chooseOperation(vasya.getJointAccount());
                break;
            default:
                chooseAccount();
        }
    }

    private void chooseOperation(BankAccount account) {
        System.out.println("Which operation do you want to do? checkBalance(1)/deposit(2)/withdrawal(3)");
        int operationType = new Scanner(System.in).nextInt();
        switch (operationType){
            case 1:
                float balance = account.checkBalance();
                System.out.println("Your balance £: " + balance);
                continueAction();
                break;
            case 2:
                System.out.println("Deposit amount £: ");
                float depositAmount = new Scanner(System.in).nextFloat();
                account.makeDeposit(depositAmount);
                continueAction();
                break;
            case 3:
                System.out.println("Withdrawal amount £: ");
                float withdrawalAmount = new Scanner(System.in).nextFloat();
                account.withdraw(withdrawalAmount);
                continueAction();
                break;
            default:
                chooseOperation(account);
        }
    }

    private void continueAction(){
        System.out.println("Would you like to continue?(Yes/No)");
        String continueAction = new Scanner(System.in).next();
        if (continueAction.equalsIgnoreCase("Yes")){
            chooseAccount();
        } else {
            System.out.println("Thank you!Good bye.");
        }

    }

}
