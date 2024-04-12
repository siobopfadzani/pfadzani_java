package Q25;

public class O extends M implements N{

    public int product(int i) {
     
        int result = super.product(i)*i;
        System.out.println("in class " + result);
    }

}
