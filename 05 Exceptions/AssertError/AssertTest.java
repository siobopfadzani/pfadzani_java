package AssertError;

public class AssertTest {
    public static void main(String[] args) {
        boolean condition = true;
        assert condition : "expected true condition";
       
        System.out.println("Finished");
    }
}
