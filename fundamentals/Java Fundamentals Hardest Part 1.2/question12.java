public class question12 {
    public static void main(String[]args)
    {
        int counter =0;
        outer:for(int i = 0;i <3;i++){
            middle:for(int j =0; j<3;j++){
                inner: for (int k = 0;k <3; k++){
                    if (k-j >0){
                        continue;
                    }
                    counter++;
                }
            }
            break outer;
        }
        System.out.println(counter);
    }
    
}
