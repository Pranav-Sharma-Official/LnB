/* Take User input in string form and perform operation.
● Take input from user in string form only and calculate the length of string
● IF length is greater than 7 then display only those character which are
present in even index number
● If length is less than or equals to 7 then display only those character which
are present in odd index number */

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
