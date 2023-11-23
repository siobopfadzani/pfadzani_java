public class question12 {
    public static void main(String[]args)
    {

        int counter =0;

        //breakdown of code to see the sequence of the code
        outer:for(int i = 0;i <3;i++){

            System.out.println("i = " +i);

            middle:for(int j =0; j<3;j++){

                System.out.println("j = " + j);
                
                inner: for (int k = 0;k <3; k++){
                    System.out.println("k = " +k);
                    
                    if (k-j >0){
                        continue;
                    }
                    counter++;
                    System.out.println("counter at the inner loop = " + counter);
                }
            }
            break outer;
        }
        System.out.println(counter);

        //Original code
     
    //     outer:for(int i = 0;i <3;i++){
    //         middle:for(int j =0; j<3;j++){
    //             inner: for (int k = 0;k <3; k++){
    //                 if (k-j >0){
    //                     continue;
    //                 }
    //                 counter++;
    //             }
    //         }
    //         break outer;
    //     }
    //     System.out.println(counter);
     }
    
}
