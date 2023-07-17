public class AgeCalculator {

   public void calculateAge(String dateOfBirth) {
   
       long seconds = 365*24*60*60;
       long miliseconds = 365*24*60*60*1000;
       String year = dateOfBirth.split("/")[0];
       int age = 2023 - Integer.parseInt(year);
       System.out.println("Your age is: " + age);
       System.out.println("Age in seconds: " +  seconds*Integer.parseInt(year)+ "s" );
       System.out.println("Age in miliseconds:" +  miliseconds*Integer.parseInt(year)+ "mi." );
       
   }

}

