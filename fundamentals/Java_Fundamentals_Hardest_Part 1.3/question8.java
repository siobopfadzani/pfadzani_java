public class Question8 
{
  public static void main(String[]args)
  {
      String[] s = new String[3];
      s[0]="a";
      s[1]="b";
      s[2]="c";

  //breakdown code to see the sequence of the code
      int j = 0;
       do
       {
         System.out.println(s[j]);
         j = j + 1;

       }while(j < s.length);
  //Original code
    
    for(int i= 0;i < s.length;i++){
    
        System.out.println(s[i]);
    }
  }    
}
