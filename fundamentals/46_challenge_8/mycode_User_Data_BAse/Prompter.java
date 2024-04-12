import java.util.Scanner;

public class Prompter {

    public static String prompt(String prompt) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        return scan.nextLine();
    }
}

