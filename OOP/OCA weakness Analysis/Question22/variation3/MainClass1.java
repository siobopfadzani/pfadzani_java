package Question22.variation3;

public class MainClass1 {
    public static void main(String[] args) {
        Puff puff = new Puff();
        puff.setPString("null");
        System.out.println(puff.getPString());
    }
    
}
 class Puff
{
 private String pString = new String("hello");

 public String getPString()
 {
    return pString;
 }
 public void setPString(String a)
 {
    this.pString = a;
 }
}
