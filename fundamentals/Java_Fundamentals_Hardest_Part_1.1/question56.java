

public class question56 {
    public static void main(String[]args)
    {
        int[] numbers = {10,20,300};
        int num = 0;

    //Code breakdown to see the sequence of the code

        while (num<numbers.length)
        {
            if (numbers[num]>100)

            {
                System.out.println(numbers[num] + " is greater than 100");
            }else if(num >50)

            {
                System.out.println(numbers[num]+ " is greater than 50");
            }else{

                System.out.println(numbers[num]+ " is less than 50");
            }
            num++;
            System.out.println("value of num at each iteration " + num);
        }
    // Original code

        while (num<numbers.length)
        {
            if (numbers[num]>100)

            {
                System.out.println(numbers[num] + " is greater than 100");
            }else if(num >50)

            {
                System.out.println(numbers[num]+ " is greater than 50");
            }else{

                System.out.println(numbers[num]+ " is less than 50");
            }
            num++;
        }

    }
    
}
