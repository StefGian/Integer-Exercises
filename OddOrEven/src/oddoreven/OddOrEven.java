package oddoreven;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class OddOrEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number: ");
        int number = scanner.nextInt();
        System.out.println(number);
        
        if(number % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
    
}
