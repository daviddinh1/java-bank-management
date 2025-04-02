import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        boolean stop = false;
        BankAccount newBank = new BankAccount(0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("hi please enter a first name!");
        String firstName = scanner.nextLine();
        newBank.setFirstName(firstName);

        System.out.println("hi please enter a last name!");
        String lastName = scanner.nextLine();
        newBank.setLastName(lastName);

        SavingsAccount newSavings = new SavingsAccount(newBank.getAmount());
        CheckingsAccount newCheckings = new CheckingsAccount(newBank.getAmount());

        while(!stop){
            System.out.println("Please enter 1 to use ur savings or 2 to use ur checkings");
            int userInput = scanner.nextInt();
            if(userInput == 1){
                int savingsInput = 0;
                System.out.println("Please enter 1 to withdraw");
                System.out.println("Please enter 2 to deposit");
                savingsInput = scanner.nextInt();
                if(savingsInput == 1){
                    System.out.println("Please enter a amount to withdraw");
                    double withdrawAmount = scanner.nextDouble();
                    newSavings.withDraw(withdrawAmount);
                }
                else if(savingsInput == 2){
                    System.out.println("Please enter a amount to deposit");
                    double depositAmount = scanner.nextDouble();
                    newSavings.deposit(depositAmount);
                }
                else if(savingsInput == 3){
                    System.out.println("Total: " + newSavings.getAmount());

                }
                else{
                    System.out.println("Please enter 1 or 2");
                }
            }
            else if(userInput == 2){
                int checkingsInput = 0;
                System.out.println("Please enter 1 to withdraw");
                System.out.println("Please enter 2 to deposit");
                System.out.println("Please enter 3 to view amount in checkings");

                checkingsInput = scanner.nextInt();
                if(checkingsInput == 1){
                    System.out.println("Please enter a amount to withdraw");
                    double withdrawAmount = scanner.nextDouble();
                    newCheckings.withDraw(withdrawAmount);
                }
                else if(checkingsInput == 2){
                    System.out.println("Please enter a amount to deposit");
                    double depositAmount = scanner.nextDouble();
                    newCheckings.deposit(depositAmount);
                }
                else if(checkingsInput == 3){
                    System.out.println("Total: " + newCheckings.getAmount());
                }
                else{
                    System.out.println("Please enter 1 or 2");
                }

            }
            else if(userInput == 3){
                stop = true;
            }
            else{
                System.out.println("Please enter 1 or 2 or 3 to exit");
                userInput = scanner.nextInt();
            }

        }
    }
}
