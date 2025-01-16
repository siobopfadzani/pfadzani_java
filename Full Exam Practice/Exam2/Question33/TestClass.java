package Exam2.Question33;

import javax.imageio.IIOException;
import java.io.*;
class portConnector {
    public portConnector(int port) throws Exception
    {
        if(Math.random() > 0.5)
        {
            throw new IOException();
        }
        throw new RuntimeException();
    }
    
}
public class TestClass
{
	public static void main(String[]args) throws Exception
	{
		try
		{
			portConnector pc = new portConnector(10);
		}
		catch(RuntimeException re)
		{
			re.printStackTrace();
		}
	}
}