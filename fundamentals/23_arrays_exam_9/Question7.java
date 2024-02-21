public class Question6 {
    public static float st_variable;
    private float floatVar;

    public static void main(String[] args) {
        Question6 obj = new Question6();
        System.out.println(st_variable);   // Accessing static variable
        System.out.println(obj.floatVar);  // Accessing instance variable through an instance
    }
}
