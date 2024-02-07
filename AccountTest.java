import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("koech",50.0);
        Account account2 = new Account("kilel",90.0);

        System.out.printf( "%s balance:$%.2f%n",
                account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(),account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account1  %n%n",depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",
        account1.getName(),account1.getBalance());


        System.out.println("Enter deposit amount for account2: ");
        double depositAmount1 = input.nextDouble();
        System.out.printf("%n adding %.2f to account1  %n%n",depositAmount1);
               account2.deposit(depositAmount1);

        System.out.printf("%s balance: $%.2f%n",
        account2.getName(),account2.getBalance());

    }
}
