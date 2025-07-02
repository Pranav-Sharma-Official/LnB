import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++){
            System.out.print("Enter num" + i + ": ");
            int n = scanner.nextInt();
            if (n >= 9){
                sum += n;
            }
        }

        System.out.println("Sum of numbers >= 9 is: " + sum);
        scanner.close();
    }
}
