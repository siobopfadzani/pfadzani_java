/** This is the prompter class of the javadoc 
 * @author pfadzani
*/
/**
 * scanner import
 */
import java.util.Scanner;
public class Prompter {
    /**Method level javadoc */
    public static String prompter(String message)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextLine();
    }
}
