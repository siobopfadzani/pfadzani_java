public class EqualsTest1 {
    public static void main(String[] args) {
       char A = '\u0005';
        if (A ==0x0005L)
            System.out.println("Equal");
        else
            System.out.println("not equal");
    }
}
