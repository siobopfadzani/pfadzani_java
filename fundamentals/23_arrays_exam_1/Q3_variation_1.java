public class ArrayTest1 {
    public static void main(String[] args) {
        String[] sA1 = new String[]{"aaa"};
        String[] sA2 = new String[]{"aaa"};
        String[] sA3 = new String[1]; sA3[0] = "aaa";
        String[] sA4 = {new String("aaa")};
        String[] sA5 = {"aaa"};

        System.out.println(sA1[0]);
        System.out.println(sA2[0]);
        System.out.println(sA3[0]);
        System.out.println(sA4[0]);
        System.out.println(sA5[0]);
    }
}

