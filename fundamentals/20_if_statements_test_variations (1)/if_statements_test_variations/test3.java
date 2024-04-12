public class NestedIf {

    public static void main(String args[]) {

	  int age = 20, weight = 50;

	  if(age >= 18) {

	      System.out.println("Person is allowed to vote");

	    if(weight >= 45) {

              System.out.println("Person is allowed to vote and is fit to donate blood");
	    }
            else {

	    	   System.out.println("Person is not fit to donate blood");
	    }
	  }   
	  else {
	  	
	 	 System.out.println("Person is not allowed to vote");

	}    
  }
} 
