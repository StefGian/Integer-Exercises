package stringtointeger;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class StringToInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number(string):");
        String number = scanner.next();

        int num = Integer.parseInt(number);
        System.out.println("The value of the number you typed is: " + num);
    }

}
