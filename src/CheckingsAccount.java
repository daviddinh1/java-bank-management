class CheckingsAccount extends BankAccount{
    public CheckingsAccount(double amount){
        super(amount);
    }

    public void withDraw(double withdrawAmount){
        if(super.amount == 0 || super.amount - withdrawAmount < 0){
            System.out.println("Checkings account is to low");
            System.out.println(super.amount);
        }else{
            super.amount -= withdrawAmount;
        }
    }

    public void deposit(double depositAmount){
        super.amount += depositAmount;
    }
}