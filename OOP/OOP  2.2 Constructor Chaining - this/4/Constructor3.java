public class Constructor3 {
    public Constructor3(){
   	 System.out.println("Running no-args constructor");
    }
    
    public Constructor3(String name,String surname){
   	 this(name,surname,"developer ");
   	 System.out.println("Running name arg constructor: Name ="+name+ " "+ surname);
    }
    
    public Constructor3(String name, String surname,String jobDescription){
         this();
         System.out.println(name + " " +surname + " is a " + jobDescription);
    }
}

