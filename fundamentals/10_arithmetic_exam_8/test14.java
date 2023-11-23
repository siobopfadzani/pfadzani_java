public class test3 {
    public static void main(String[] args) {

 // Breakdown to show the sequence of the code
        double e = 2;
        double f = 8;
        double g;

        g = 1 * 2;          
        System.out.println("value of g " + g);
        g = 2 * 5;
        System.out.println("value of g " + g);
        g = 10 * 3;
        System.out.println("value of g " + g);

        double h = 29 * 3;
        System.out.println("value of h " + h);
        h = 87 + 8;
        System.out.println("value of h " + h);
        h = g + h; 
        System.out.println("value of h " + h);

 // Original code
        double a = 2;
        double b = 8;
        double c;

        c = (--a * ++a) * 5 * (++a);
        c += --c * a++ + b--;
        System.out.println(c);
    }
}
