package Question5;

import java.io.IOException;

public class PortConnector {
    PortConnector(int port)throws IOException
    {
        
    }
    
}
  class CleanConnector extends PortConnector
{
    CleanConnector () throws NullPointerException, IOException
    {
        super(10);

    }
}