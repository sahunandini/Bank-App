import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name, Password and Balance to create an account");

        // Create a User
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();

        // Creation of the account
        SBIUser user = new SBIUser(name, balance, password);
        System.out.println("The account number of new SBI Account is " + user.getAccountNo());

        // Add Amount
        String message = user.addMoney(100000);

        // Check Balance
        double newBalance = user.getBalance();
        System.out.println("The new Balance is " + newBalance);

        // Withdraw Money
        System.out.println("Enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money, pass));

        // Rate if Interest
        System.out.println("The Interest for 10 years on " + user.getBalance() + " Rs. will be : " + user.calculateInterest(10));
    }
}