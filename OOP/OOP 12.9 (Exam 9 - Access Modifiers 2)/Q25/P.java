package Q25;

public class P extends M{

    public int product(int i) {
        int result = super.product(i) + i;
        System.out.println(result);
        return result;
    }

}
