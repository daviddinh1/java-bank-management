public class SavingsAccount extends BankAccount{
    int numWithdrawls;
    public static final double INTEREST_RATE = 0.03;

    public SavingsAccount(double amount){
        super(amount);
        this.numWithdrawls = 0;
    }

    public void withDraw(double withdrawlAmount){
        if(numWithdrawls > 12){
            System.out.println("Went over number of widthdrawls allowed");
        } else if(super.amount == 0 || super.amount - withdrawlAmount < 0){
            System.out.println("Amount is too low to withdraw");
        }
        else{
            super.amount -= withdrawlAmount;
        }
    }

    public void deposit(double depositAmount){
        super.amount += depositAmount;
    }
}
