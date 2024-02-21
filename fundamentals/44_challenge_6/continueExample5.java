class continueExample5
{
    public static void main(String[] args)
    {
        int students = 20; // Strength of Class
        int days[] = {0, 1, 2, 3};
        for (int i = 0; i < days.length; i++)
        {
            System.out.println("Day " + days[i]);
            int rem = days[i] % 2; 
            
            for (int j = 1; j <= students; j++)
            {
                if (j % 2 == rem) /* if j is even and day is also even (or vice versa), we will skip the iteration*/
                {
                        continue;
                }
                    System.out.print(j + ", ");
                    }
                        System.out.println("\n");
                        }
        }
}
