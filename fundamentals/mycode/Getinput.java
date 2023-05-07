public class GetInput{ 
     public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name and surname:");        
        String nameSurname = in.nextLine();
        System.out.println("hello " + nameSurname);
    }
}

