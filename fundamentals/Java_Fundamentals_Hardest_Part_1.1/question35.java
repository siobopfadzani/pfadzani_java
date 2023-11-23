public class question35 {
    int sz;

    public static void main(String[] args) 
    {
        question35 instance = new question35();
        instance.init();
        System.out.println("sz value: " + instance.sz);
    }

    public void init() {
        sz = 10;
        String tmp = getParameter("size");
        if (tmp != null && tmp.equals("Big")) {
            sz = 20;
        }
    }

    public String getParameter(String size) 
    {

        return size; 
    }
}

