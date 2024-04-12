public class Scaler {

    //static variable
    static int count_clicks;

    String name;

    void insert(String name) {
        //increment count_clicks
        ++count_clicks;
        this.name = name;
    }

    public static void main(String[] args)
    {
        Scaler object = new Scaler();
        object.insert("hello");

        Scaler object1 = new Scaler();
        object1.insert("bye");

        Scaler object2 = new Scaler();
        object2.insert("thankyou");

        System.out.println("Total Clicks: " + count_clicks);
    }
}
