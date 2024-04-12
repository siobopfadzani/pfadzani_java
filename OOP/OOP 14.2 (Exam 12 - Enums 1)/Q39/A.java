package Q39;

public enum A {
    AAA;
    String s = "A";
    {
        s = s + "A";
    }
    private A()
    {
        s = s + "A";
    }

}
