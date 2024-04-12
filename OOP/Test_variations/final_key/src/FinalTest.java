// Reference Final Variable
class ReferenceFinalVariableExample {
    static int a = 10;

    public static void main (String[] args)
    {
        // Final reference variable
        final StringBuffer strBuffer = new StringBuffer("Hello");

        // Printing the element in strBuffer
        System.out.println(strBuffer);

        // changing internal state of object reference by
        // final reference variable strBuffer
        strBuffer.append("World");

        // Printing the element in strBuffer
        System.out.println(strBuffer);
    }
}
