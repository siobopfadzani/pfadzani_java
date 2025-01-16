

public class Eagle extends Game{
    public void play()
    {
        System.out.println("playing soccer");
    }
 
    public static void main(String[] args) {
        Game g = new Eagle();
        g.play();
    }
}
class Game
{
    public void play()
    {
        System.out.println("playing");
    }
}