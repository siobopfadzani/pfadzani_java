public class Variation6 
{
    public static void main(String[]args)
    {
        char   [] ca ={0x5e, '\u005e',78};
        String [] arr = new String[2];
        String [] arrStrings = {"false","null"};

        System.out.println((ca[0]== ca[2])+ "  "+(ca[1]==ca[0]));
        System.out.println(arrStrings[1].equals(arr[1]));
        System.out.println(arrStrings[1] == arr[1]);
        
    }
    
}
