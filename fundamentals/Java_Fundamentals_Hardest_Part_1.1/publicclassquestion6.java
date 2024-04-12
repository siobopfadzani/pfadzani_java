public class question6{
	public static void main(String[]args)
	{
		int mask = 0;
		int count = 0;

	  // breakdown trying to figure out the operator sequence

	  	boolean a = (5>7);
	  	System.out.println("a =" + a);

	  	boolean b = (++count<10);
	  	System.out.println("b = " + b);
	  	System.out.println("count = "+ count);

	    
	    boolean d = ((a||b));
	    System.out.println("d = " + d);

	    boolean e = mask++ < 10;
	    System.out.println("mask = "+ mask);
	    
	    boolean f = (a||(b)|d);
	    System.out.println("f = " + f);

	    mask = (f==true)?(mask + 1):(mask);

	 
	    
	    System.out.println("mask = " + mask);


	    boolean g = 6>8;
	    System.out.println("g =" + g);

	    boolean h = g^false;
	    System.out.println("h = " + h);

	    mask = (h==true)?(mask +10):(mask=mask);
 		System.out.println("mask = " + mask);

 		boolean i = !(mask>1);
 		System.out.println("i = " + i);

 		boolean j = (i&&++count>1);
 		System.out.println("j = " + j);

 		mask = (j==true)? (mask+100):(mask=mask);

 		System.out.println("mask  ="+ mask + "count = "+ count);


	  //orignal code

		
		/*if ((5>7)||(++count<10)|mask++ <10) mask = mask+1;
		if((6>7)^false) mask = mask+10;
		if(!(mask>1)&& ++count>1) mask = mask+100;
		System.out.println(mask+ " " + count);*/
	}
}