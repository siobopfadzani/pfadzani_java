package Exam5.Question17;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(getMsg((char)10));
        System.out.println(getmsg2('1'));
    }
    public static String getMsg(char x)
    {
        String msg = "Input value must be ";
        msg = msg.concat("smaller than x ");
        msg.replace('x', x);
        String rest = "and larger than o";
        msg.concat(rest);
        return msg;

    }
    public static StringBuilder getmsg2(char c){
        StringBuilder msg = new StringBuilder("input value");
        msg.append(" hello world");
        msg.replace(0,5,"xxxxx");
        msg.replace(1,5, "Repo");
        return msg;
    }
    
}
