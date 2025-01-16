public class Test{     
    public static void testInts(Integer obj, int var){         
        obj = var++;         
        obj++;    
     }     
     public static void main(String[] args) { 
        
        Test test = new Test();
        test.me(1, 2);
        Integer val1 = new Integer(5);         
        int val2 = 9;        
         testInts(val1++, ++val2);         
         System.out.println(val1+" "+val2);     
        } 

        void me(Object i,Object j)
        {
            System.out.println("in object");
        }
    } 