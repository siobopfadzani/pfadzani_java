public class Variation16 
{
    public static void main(String[] args) 
    {
        int myArray[] = {11,32,13,44,5,60};
        Variation16.printArray("Original Array ", myArray);
        ChangeIt.doIt(myArray);
        Variation16.printArray("changed array  ", myArray);
    } 
    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++)
        {
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }   
        }
        System.out.print("]\n");
    } 
}
class ChangeIt
{
    static void doIt(int [] z)
    {
        int i;
        for (i = 0; i < z.length/2-1;i++)
        {
            int temp = z[i];
            int temp2 = z[z.length -i- 1]; 
            z[z.length - 1] = temp;
            z[i] = temp2;
        }    
    }
}
