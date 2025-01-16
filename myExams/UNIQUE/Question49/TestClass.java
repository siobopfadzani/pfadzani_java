package UNIQUE.Question49;

class TestClass {

    public static void main(String[] args) {
        String str = " ";
        str.trim();
        System.out.println(str.equals("")+ " " + str.isEmpty());

        String str1 ="Java";
        String str2 = new String("java");
        System.out.println(str2.equals(str1.toLowerCase()));

        Long ln = new Long(42);
        System.out.println(ln.equals(42));

    }
}