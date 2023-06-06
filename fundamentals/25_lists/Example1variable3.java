import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List <String> mylist = new ArrayList<>();

        mylist.add("banana");
        mylist.add("apple");
        mylist.add("mango");
        mylist.add("strawberry");

        for (int a = 0; a < mylist.size(); a++) {
            System.out.println("fruits=" + mylist.get(a));
        if (a<=10){
        	mylist.remove("banana");
        	System.out.println("code does not include bananas");
        }else {
        	System.out.println("end of code");
        }
        }
     LinkedList<String> mylist2 = new LinkedList<>();
      
       mylist2.add("rio");
       mylist2.add("toyota");
       mylist2.add("nissan");
       
       System.out.println(""+mylist2);
    }
}

