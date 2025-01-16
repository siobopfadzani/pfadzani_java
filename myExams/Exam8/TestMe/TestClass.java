package Exam8.TestMe;
interface Movable {   
    int location = 0;   
    void move(int by);   
    public void moveBack(int by); 
}   
class Donkey implements Movable{     
    int location = 200;     
    public void move(int by) {         
        location = location+by;
        System.out.println("location at move " + location);     
    }     
    public void moveBack(int by) {         
        location = location-by; 
        System.out.println("location at move back " + location);    
    } 
}  
public class TestClass {     
    public static void main(String[] args) {         
        Donkey m = new Donkey();         
        m.move(10);         
        m.moveBack(20);         
        System.out.println(m.location);     
    } 
}