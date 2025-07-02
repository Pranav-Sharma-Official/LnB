import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        int product, sum;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the value of num2: ");
        int num2 = scanner.nextInt();

        product = num1 * num2;
        sum = num1 + num2;

        if (product > 500) System.out.println("Sum: " + sum);
        else System.out.println("Hello LNB code is running fine!!");

        scanner.close();
    }
}