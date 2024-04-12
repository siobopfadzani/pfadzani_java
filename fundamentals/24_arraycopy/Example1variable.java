public class Arrayteste {

   public static void arraytest() {
        int i = 0;
        String[][] array = new String[10][10];
        array[5][0] = "hello";
        array[0][5] = "you";
        
        System.arraycopy(array[5],0, array[1],1,1);
        for (; i < 5; i++) {
            System.out.println(array[5][0]+" "+array[0][5]);
            System.out.println(array[1][1]);
            
        }
    }

    public static void main(String[] args) {
        arraytest();
    }
}

