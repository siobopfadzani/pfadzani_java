public class Question22 {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Break");
        while(count <= 10)
        {
            count = count + 1;
            if (count == 5)
                break;
        }
        System.out.print(count++);
    }
    
}
