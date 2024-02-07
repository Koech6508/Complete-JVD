

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        int Number1;
        int Number2;
        int sum;

        System.out.println("Please enter first integer: ");
        Number1 = input.nextInt();

        System.out.println("Please enter the second integer: ");
        Number2 = input.nextInt();

        sum = Number1 + Number2;

        System.out.printf("The sum is %d%n: ",sum );
    }
}
