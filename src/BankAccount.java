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

}



