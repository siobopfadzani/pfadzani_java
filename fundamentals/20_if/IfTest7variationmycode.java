public class myclass{

public static void main(String[]args){

int value1=30;
int value2 =50;

String print = value1 <= value2 ? "value1 is greater than value b" : "value2 is greater than value2";
System.out.println(print);

if (value1>=value2||value2<=value1)
{
System.out.println("value in the limit");
}
else if(value1>value2){
System.out.println(value1);
}
else {
System.out.println(value2);
}
}
}


