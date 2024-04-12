class conersion{
public static void main(String[]args){

double a =295.04;
int b =300;
byte c = (byte) (a +=100);
byte d = (byte) (b+=a);
System.out.println(c+ " " + d);
  }
}
