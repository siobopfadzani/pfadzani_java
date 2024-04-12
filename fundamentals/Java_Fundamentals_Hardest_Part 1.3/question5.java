public class Question5 
{
    public static void main(String[]args)
    {

    Double n1 = -1.0,n2 =4.5,n3=-5.3,largestNumber;

    //code breakdown to show the sequence of the code
        boolean a = (n1 >= n2);
        boolean b = (n1>=n3);
        boolean c = (n2>=n3);
       largestNumber = (a==true)?((b==true)?n1 :n3):n2;
       largestNumber = (c ==true)?n2:n3;

       System.out.println("breakdown result "+largestNumber);


    // Original code
        

        if(n1 >=n2)
        {
            if(n1>=n3){
            largestNumber = n1;
        } 
        else {

                largestNumber = n3;
             }
       } else{
            if(n2 >=n3){
                largestNumber=n2;
            }else{
                largestNumber = n3;
            }
        
        }
        System.out.println("largest number is " + largestNumber);  
  }
}

