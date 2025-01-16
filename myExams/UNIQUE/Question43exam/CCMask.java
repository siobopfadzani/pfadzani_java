package UNIQUE.Question43exam;

public class CCMask {
    public static String maskCC(String creditcard)
    {
        String x = "xxxx-xxxx-xxxx-";
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditcard,15,19);
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121"));
        
    }
    
}
