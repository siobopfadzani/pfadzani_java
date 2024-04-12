public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Unknown day");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                // Fall-through to the next case without a break
            case 4:
                System.out.println("Thursday");
               
            
        }
    }
}
