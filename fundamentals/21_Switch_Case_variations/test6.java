public class test6 {
    public static void main(String args[]) {

        int age = 55;
        boolean a = true;
        boolean b = false;

        if (b && ++age <= 50)
        {
            System.out.println("ok "+age);
        }
        else if (++age >= 10 && b) {
            System.out.println("kool" + age);
        }

        System.out.println(age);
    }
}
