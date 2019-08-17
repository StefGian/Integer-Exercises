package sum;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please insert first number:");
        int num1 = scanner.nextInt();
        System.out.println("Please insert second number:");
        int num2 = scanner.nextInt();
        System.out.println("Please insert third number:");
        int num3 = scanner.nextInt();
        
        int sum = num1 + num2;
        if(sum == num3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        
    }
    
}
