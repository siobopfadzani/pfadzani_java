public class Main
{
    public static void main(String[]args) {
        Game game = new Soccer();
        try {
            game.play();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
