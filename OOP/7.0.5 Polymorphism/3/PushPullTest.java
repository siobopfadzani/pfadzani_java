public class PushPullTest {
    public static void main(String[] args) {

        PushPull pushPull = new PushPull();

        Push var1 = null;
        Pull var2 = null;

        var1 = (Push) var2;
        var1 = pushPull;
        var2 = pushPull;

    }
}

