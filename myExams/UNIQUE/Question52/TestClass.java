package UNIQUE.Question52;

public class TestClass {
    public static void main(String[] args) {
        String[] strs = new String[2];
        int indx = 0;
        for(String s : strs)
        {
            strs[indx].concat(" elements " +indx);
            indx++;
        }
    }


    void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
            JILL:{
                System.out.println(c);
                if (c > 3) break JILL; else c++;
            } ;
           
        }
     }

     
    
}
class Square {
    private double side = 0;  // LINE 2
  
    public static void main(String[] args) {   // LINE 4
        double side = 10;
        Square sq = new Square();  // LINE 5
        sq.side = 10;  // LINE 6
   }
}
