package Question12;

import java.io.IOException;

public class PortConnector {
    public PortConnector(int port) throws IOException
    {

    }
    
}
class CleanConnector extends PortConnector
{
    public CleanConnector() throws IOException
    {
        super(0);
    }
}