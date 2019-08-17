package integersexercise;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class IntegersExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        number = scanner.nextInt();
        System.out.printf("%d + %d%d  + %d%d%d", number, number, number, number, number, number);
    }

}
