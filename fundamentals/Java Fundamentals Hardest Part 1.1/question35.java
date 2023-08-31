public class question35 {
    int sz;
    public static void main(String[]args)
    {
        question35 obj = new question35();
        obj.init();
     

    }
    public void init()
    {
        sz = 10;
        String tmp = getParameter("small");
        if(tmp !=null &&tmp.equals("Big"))
        sz = 20;
        System.out.println(sz);
    }
    public String getParameter(String sz)
    {
        return "small";
    }
}
