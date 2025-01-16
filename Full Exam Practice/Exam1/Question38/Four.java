package Exam1.Question38;

public class Four {
    static int x;
    public static void main(String[] args) {
        String ss ="aBc";
        String s = "ABC";
        switch (s) {
            case "": x++;
                
                break;
            case "AbC": x++; break;
            case "ABC": x--;
        
            default:
                break;
                case " ": x++; break;
        }
    }
    
}
