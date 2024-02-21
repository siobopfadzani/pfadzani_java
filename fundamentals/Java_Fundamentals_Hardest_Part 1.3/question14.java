public class question14
{
    public static void main(String[]args)
    {
        int c =0;

        //breakdown of code to show the sequence of the code

            A: for (int i = 0;i<2;i++){
                System.out.println("i in the first for is " +i);

            B: for(int j = 0; j <2;j++){
                System.out.println("j  in the second for is " +j);

                C: for(int k = 0; k<3;k++){
                    System.out.println("k  in the third for is " +k);

                    c++;
                    System.out.println("c is " + c);
                    if(k>j) break;
                } continue B;
            }
        }
        System.out.println(c);

        //Original code
        
        A: for (int i = 0;i<2;i++){
            B: for(int j = 0; j <2;j++){
                C: for(int k = 0; k<3;k++){
                    c++;
                    if(k>j) break;
                } continue B;
            }
        }
        System.out.println(c);
    }
}