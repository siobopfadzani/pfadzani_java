package folder13;
public class CatchingEg3 {
    public void doSomething()throws Exception{
        int i = 42;
       
        if(i > 30){
            throw new SioboException("An error occurred");
        }
        System.out.println("Doing something...");
    }
 }
 