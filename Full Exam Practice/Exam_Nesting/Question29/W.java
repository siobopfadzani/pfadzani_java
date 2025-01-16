package Exam_Nesting.Question29;
interface X
{
    default void displayX()
    {
        System.out.println("X");
    }
}
interface Y extends X {
    default void displayX()
    {
        System.out.println("y");
    }
}
    class Z implements X{
        public void displayZ()
        {
            System.out.println("Z");
        }
    }

public class W  extends Z implements Y{
    public static void main(String[] args) {
        W obj = new W();
        obj.displayZ();
    }
}
