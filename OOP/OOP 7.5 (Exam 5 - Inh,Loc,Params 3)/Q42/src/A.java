class A
{
    String value = "test";
    A(String val){
        this.value =val;
        System.out.println(this);
    }
    public String toString()
    {
        return "hello " + this.value;
    }
    void print()
    {
        System.out.print(this);
    }
}

