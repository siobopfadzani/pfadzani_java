package Question42;

public class HidePhone {
    public static String hidePhone(String fullNumber)
    {
        // return new StringBuilder(fullNumber).replace(6, 10, "xxxx").toString();
        // return new StringBuilder(fullNumber).substring(0,6) +"xxxx";
        return new StringBuilder("xxxx").insert(0,fullNumber, 0,6).toString();
    }
    public static void main(String[] args) {
       System.out.println(hidePhone("1234567890"));    
    }
}
