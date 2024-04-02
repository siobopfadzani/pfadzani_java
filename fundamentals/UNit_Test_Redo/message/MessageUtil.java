  public class MessageUtil 
  {

   private String message;

   //Constructor
   //@param message to be printed
	
   public MessageUtil(String message)
   {
      this.message = message;
   }
      
   // prints the message
   public String printMessage()
   {
      System.out.println(message);
      return mess
   }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}

