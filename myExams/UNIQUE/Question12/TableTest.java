package UNIQUE.Question12;

public class TableTest {
    static String[][]table;
    public static void main(String[] args) {

        String[] x = {"mon","tue","wed","thu","fri","sat","sun"};
        String []y1 = {"1","2","3","4","5"};
        String[] y2 = {"a","b","c"};
        table = new String[3][];
        table[0]= x;
        table[1]=y1;
        table[2]=y2;

        for (String []row : table) {
            System.out.println(row[row.length-1]);
            
        }

        for(int i = 0;i < table.length ;i++)
        {
            int j = table[i].length -1;
            System.out.println(table[i][j]);
        }

    }
    
}
