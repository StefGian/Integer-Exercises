package sumofdigits;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a number:");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println("The sum of digits is: " + sum);
    }

}
