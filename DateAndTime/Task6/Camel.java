package Task6;

class HelloWorld implements Rideable {
    int weight = 2;

    public String getGait() {
        return "mph, lope";
    }

    void go(int speed) {
        ++speed; 
        weight++;
        int walkrate = speed * weight;
        System.out.println(walkrate + getGait());
    }

    public static void main(String[] args) {
        new HelloWorld().go(8);
    }
}
interface Rideable
{
    String getGait();
}