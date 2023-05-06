public class NamesMain {
    public static void main(String[] args) {
 	   NamePrinter namePrinter = new NamePrinter();
 	   SurnamePrinter surnamePrinter = new SurnamePrinter();
 	  
 	   namePrinter.print();
 	   surnamePrinter.print();
    }
}


public class NamePrinter {
    public void print(){
 	   System.out.println("pfadzani");
    }
}

public class SurnamePrinter {
    public void print(){
 	   System.out.println("siobo");
    }
}

