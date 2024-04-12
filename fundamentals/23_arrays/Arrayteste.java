public class Arrayteste {

    static void arraytest() {
        int i = 0;
        String[][] array = new String[10][10];
        array[5][0] = "hello";
        array[0][5] = "you";

        for (; i < 5; i++) {
            System.out.println(array[5][0]+" "+array[0][5]);
            
        }
    }

    public static void main(String[] args) {
        arraytest();
    }
}

