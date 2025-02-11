import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String holder = scanner.nextLine();

        System.out.print("Enter the bank branch: ");
        String bankBranch = scanner.nextLine();

        System.out.print("Enter the bank account: ");
        int bankAccount = scanner.nextInt();

        System.out.print("Enter the initial deposit: ");
        double balance = scanner.nextDouble();

        System.out.printf("Hello, %s! Thank you for creating an account with us! Your branch is %s, your account is %d and your balance of $ %.2f is already available for withdraw.", holder, bankBranch, bankAccount, balance);

        scanner.close();
    }
}
