package Q5;
import java.io.IOException;

class Father {
    public Father()throws IOException{
        System.out.println("Father");
        throw new IOException();
    }
}