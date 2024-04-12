import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();         
            
            list1.add(0,"Hello");
            list1.add(1, "ello");
            list1.add(2,"you");
            list1.add(3,"Add");
            list1.add(4,"three");
            list1.add(5,"four");

        for (int i = 0; i < list1.size(); i++) 
        {
                
            list1.remove(1);
            list1.add(3,"roar");
            System.out.println("arr values = " + list1.get(i));

        }

    }
}
