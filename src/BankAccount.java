import java.util.UUID;
import java.util.Scanner;

public class BankAccount {
    protected String firstName;
    protected String lastName;
    protected UUID id;
    protected double amount;

    public BankAccount(double amount){
        this.id = UUID.randomUUID();
        this.amount = 0;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getAmount(){
        return amount;
    }

    public static void main(String[] args){
        //worry about the scanner logic later
//        BankAccount davidBank = new BankAccount();
    }
}
//if make file public you need to seperate everything as its best practice
class SavingsAccount extends BankAccount{
    int numWithdrawls;
    public static final double INTEREST_RATE = 0.03;

    public SavingsAccount(double amount){
        super(amount);
        this.numWithdrawls = 0;
    }

    public void withDraw(int withdrawlAmount){
        if(numWithdrawls > 12){
            System.out.println("Went over number of widthdrawls allowed");
        } else if(super.amount == 0 || super.amount - withdrawlAmount < 0){
            System.out.println("Amount is too low to withdraw");
        }
        else{
            super.amount -= withdrawlAmount;
        }
    }

    public void deposit(int depositAmount){
        super.amount += depositAmount;
    }
}

class CheckingsAccount extends BankAccount{
    public CheckingsAccount(double amount){
        super(amount);
    }

    public void withDraw(int withdrawAmount){
        if(super.amount == 0 || super.amount - withdrawAmount < 0){
            System.out.println("Checkings account is to low");
        }else{
            super.amount -= withdrawAmount;
        }
    }

    public void deposit(int depositAmount){
        super.amount += depositAmount;
    }
}

