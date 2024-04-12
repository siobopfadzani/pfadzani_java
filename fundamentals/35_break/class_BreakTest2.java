public class BreakTest2 {
    public static void main(String[] args) {   
    int i =0;
    int j = 0; 
    int k = 0;   
      outer :while(i<3)
      {
        System.out.println("outer:"+i);
        inner:while(j < 3)
        {
             System.out.println(" inner:"+j);
             j++;
              if(i == 2){
                 break inner;
                }
            while(k < 3)
            {
               System.out.println("  innest:"+k);
               k++;
            }
        }
        i++;
      }
    }
}
