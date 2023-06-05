public class MyTest {
    public static void main(String[] args) {
        String[] src = new String[]{"a", "b", "c", "d", "e"};
        String[] dest = new String[5];

        System.arraycopy(src, 0, dest, 0, src.length);
        
        for (int a = 0; a < dest.length; a++) {
            System.out.println(dest[a]);
        }
    }
}

