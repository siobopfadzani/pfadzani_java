public class Main {
   static Testclass ref;
   String []arguments;
  public static void main(String [] args){
   ref = new Testclass();
   ref.func(args);
 }
 public void func(String[]args){
    ref.arguments= args;
 }
}
