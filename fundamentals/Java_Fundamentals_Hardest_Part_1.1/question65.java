public class question65{
  public static void main(String[]args){
     byte b = 127;
     int a = 127;
     String s = "127";
     boolean bool = (b == a) ? true : false;
  
  if (bool) {

    switch (b) {
      
      case a:
        System.out.println("I am an integer");
        break;
      case 197:
        System.out.println("I am also a String");
        break;
      default:
        System.out.println("I am in a default");
        break;
      }
    }
  }
}