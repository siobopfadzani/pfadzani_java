
public class myArrayay_Challenge6 {
    public static void main(String[] args) {
        // Declaration and initialize of an empty int array of size 50
        int[] Arr = new int[50];

        int i = 0;

        while (i < Arr.length) 
        {
            while ((Arr[i] % 11 == 0) && (Arr[i] % 2 == 0)) 
            {
                Arr[i] = Arr[i] + i + 1;

                switch (Arr[i]) 
                {
                    case 11:
                        System.out.println("Value in Arr: " + Arr[i]);
                        break;
                    case 22:
                        System.out.println("Value in Arr: " + Arr[i]);
                        break;
                     case 44:
                        System.out.println("Value in Arr: " + Arr[i]);
                        break;

                    default:
                        break;
                }
            }
            i++;
        }
    }
}
