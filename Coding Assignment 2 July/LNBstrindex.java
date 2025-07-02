import java.util.Scanner;

public class LNBstrindex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        int length = string.length();

        System.out.print("Output: ");
        if (length <= 7){
            for (int i = 1; i < length; i += 2){
                System.out.print(string.charAt(i));
            }
        } else {
            for (int i = 0; i < length; i += 2){
                System.out.print(string.charAt(i));
            }
        }

        scanner.close();
    }
}