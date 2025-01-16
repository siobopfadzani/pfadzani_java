package Exam5.Question18;

// public class TestClass {
//     public static void main(String[] args) {
//         boolean flag = true;
//         switch (flag) {
//             case true:
//             default:
               
//         }
//     }
    
// }
public class MyClass {
    private static int objectCount = 0;

    public MyClass() {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        new MyClass();
        // new MyClass();
        // new MyClass();

        System.out.println("Objects created: " + MyClass.getObjectCount());
    }
}
