import java.util.Vector;

public class Clear {
    public Clear() {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);

        for (int x = 0; x<=vector.size(); x++) {
            if (x < 0) {
                System.out.println(vector.get(x));
            } else if (x >= 0) {
               vector.clear();
             
            }
        }
    }

    public static void main(String[] args) {
        Clear getName = new Clear();
    }
}

