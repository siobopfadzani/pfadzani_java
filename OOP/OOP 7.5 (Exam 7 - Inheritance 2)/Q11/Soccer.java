package Q11;

public class Soccer extends Game{
    public void play()
    {
        System.out.println("playing soccer");
    }
    public static void main(String[]args) throws Exception
    {
        Game g = new Soccer();
        g.play();
    }
}
