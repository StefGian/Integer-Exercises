package rightmostdigit;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class RightmostDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert only positive numbers!");
        System.out.println("Insert first number:");
        int num1 = scanner.nextInt();
        System.out.println("Insert second number:");
        int num2 = scanner.nextInt();
        System.out.println("Insert third number:");
        int num3 = scanner.nextInt();
        
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;
        
        if (lastDigit1 == lastDigit2){
            System.out.println("true");
        }else if (lastDigit1 == lastDigit3){
            System.out.println("true");
        }else if (lastDigit2 == lastDigit3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}
