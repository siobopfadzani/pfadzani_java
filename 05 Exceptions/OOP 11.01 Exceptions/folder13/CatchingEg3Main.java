package folder13;
public class CatchingEg3Main {
    public static void main(String[] args) throws Exception{
        try{
            CatchingEg3 myObject = new CatchingEg3();
            myObject.doSomething();
        }
        finally{
            System.out.println("Finished");
        }
    }
 }
 
 
 