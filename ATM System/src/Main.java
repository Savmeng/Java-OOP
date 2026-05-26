import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(1234, "John", 1111, 1000.0);
        System.out.println("Welcome to ATM System");
        System.out.print("Enter Account Number: ");
        int accountNum= Integer.parseInt(sc.nextLine());

        System.out.print("Enter PIN: ");
        int pin= Integer.parseInt(sc.nextLine());
        if (accountNum != account.getId() || pin != 1111) {
            System.out.println("Invalid account or PIN!\n");
            return;
        }
        System.out.println("Login successful!\n");
        while (true) {


            System.out.println("======= ATM Menu =========");
            System.out.println("1.Check Balance \n2.Deposit Money \n3.Withdraw Money \n4.Exit");

            System.out.print("Choose option (1-4): ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Current balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit =Double.parseDouble(sc.nextLine());
                    if (deposit > 0) {
                        account.deposit(deposit);
                        System.out.println("Deposit successful!");
                        System.out.println("New balance: $" + account.getBalance());
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = Double.parseDouble(sc.nextLine());
                    if (account.withdraw(withdraw)) {
                        System.out.println("Withdraw successful!");
                        System.out.println("Remaining balance: $" + account.getBalance());
                    } else {
                        System.out.println("Insufficient balance or invalid amount!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM System\nGoodbye!");
                    return;
                default:
                    System.out.println("Invalid option!");
            }

        }
    }
}