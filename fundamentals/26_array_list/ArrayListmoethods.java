import java.util.*;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add(0, "Hello");
        list1.add(1, "ello");
        list1.add(2, "you");
        list1.add(3, "Add");
        list1.add(4, "three");
        list1.add(5, "four");

    // Using the contains method

        boolean containsRoar = list1.contains("roar");
        System.out.println("Does the list contain 'roar'? " + containsRoar);

    // Using the indexOf method

        int indexOfAdd = list1.indexOf("Add");
        System.out.println("Index of 'Add': " + indexOfAdd);

        for (int i = 0; i < list1.size(); i++) {
            list1.remove(1);
            list1.add(3, "roar");
            System.out.println("arr values = " + list1.get(i));
            list1.set(1, "Add");

        }

    //using the contains method to check is roar has been added

        containsRoar = list1.contains("roar");
        System.out.println("Does the list contain 'roar'? " + containsRoar);

    //setting index 3 to something different using the set method

        list1.add(3, "your out"); 

    //using the contains method to check is roar has been added

        containsRoar = list1.contains("roar");
        System.out.println("Does the list contain 'roar'? " + containsRoar);

    // Using the size method

        int size = list1.size();
        System.out.println("Size of the list: " + size);
    }
}
