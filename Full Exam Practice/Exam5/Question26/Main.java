package Exam5.Question26;

public class Main {
    public static void main(String[] args) {
        
    }
    
}
interface  inter {
    int variable = 10;
    default int methodcheck()
    {
        // variable =20;
        return 10;
    }
    
}