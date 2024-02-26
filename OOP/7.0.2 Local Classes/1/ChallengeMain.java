public class ChallengeMain
{
    static int staticInitializer;
    int instanceInitializer;

    public void ChallengeMethod()
    {

    }
    public ChallengeMain()
    {

    }


    static
    {
        staticInitializer = 0;
    }

    {
        instanceInitializer =10;
    }

    public static void main(String[]args)
    {

    }
    public static int ordinaryMethod()
    {
        return 0;

    }

}