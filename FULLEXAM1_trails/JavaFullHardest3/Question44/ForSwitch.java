package Question44;

public class ForSwitch {
    public static void main(String[] args) {
        char i;
        Loop: for(i =0;i < 5;i++)
        {
            switch (i++) {
                case '0':System.out.println("A");
                case    1: System.out.println("B");break Loop;
                case    2: System.out.println("C");break;
                case    3: System.out.println("D");break;
                case    4: System.out.println("E");
                case    'E': System.out.println("F");
            }
        }
    }
    
}
