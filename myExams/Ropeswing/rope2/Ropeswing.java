package Ropeswing.rope2;
import Ropeswing.rope.*;
import static Ropeswing.rope.Rope.*;
public class Ropeswing {

    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();
    {
        System.out.println(rope1.length);
    }
    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
    }

}
