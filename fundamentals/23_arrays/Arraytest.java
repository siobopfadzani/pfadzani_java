public class Arraytest{
public static void main(String[]args){
    
    double []arr= new double[10];
    arr[0]=20;
    arr[1]=arr[0];
    arr[3]=arr[0];
    arr[0]= arr.length;
    for (int i=0;i<5;i++){
       System.out.println("" +arr[i]);
     }
   }
}
