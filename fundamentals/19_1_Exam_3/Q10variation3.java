int sz;
public void init(){
       sz = 10;
       String tmp = getParameter("size");
        if ( tmp ==null || tmp.equals("Big"))
            sz=20;
    
}
