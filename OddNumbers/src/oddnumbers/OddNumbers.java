package oddnumbers;

/**
 *
 * @author stefa
 */
public class OddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 99; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    
}
