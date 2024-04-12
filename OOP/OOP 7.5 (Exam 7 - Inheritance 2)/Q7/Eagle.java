class Eagle extends Bird
{
    public String name;
    public Eagle(String name)
    {
        this.name = name;
    }
    public static void main(String[] args) {
        System.out.println(new Eagle("bald Eagle ").name);
    }
}