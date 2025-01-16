package Question45;
        import java.time.LocalDateTime;
        import java.time.format.DateTimeFormatter;
public class SubstringExample {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        
        // Extracting a substring from index 7 to 12
        String substring = originalString.substring(3, 12);
        
        // Output the original string and the substring
        System.out.println("Original String: " + originalString);
        System.out.println("Substring (7 to 12): " + substring);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before : " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(formatter);
        String formatDateTime = now.format(formatter);
        // System.out.println("After : " + formatDateTime);
    
        }
        
    }
 
