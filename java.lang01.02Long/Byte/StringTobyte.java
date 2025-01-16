package Byte;

public class StringTobyte {
    public static void main(String[] args) {
        String value = "120";
        // using valueOf method

        byte value2 = Byte.valueOf(value);
        System.out.println(value2);

        // using the parseBy method
        
        byte value3 = Byte.parseByte(value);
        System.out.println(value3);
    }
    
}
