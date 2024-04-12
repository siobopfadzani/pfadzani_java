public class InstCounterTest {
	public static void main(String[] args) 
    {
    
		InstanceCounter obj1 = new InstanceCounter();
		InstanceCounter obj2 = new InstanceCounter();
		InstanceCounter obj3 = new InstanceCounter();

                        //sysout InstanceCounter.staticCounter

                        System.out.println(obj1.getStaticCounter());
                        System.out.println(obj2.getStaticCounter());
                        System.out.println(obj3.getStaticCounter());

                        InstanceCounter.staticCounter = 1000;

                        //sysout InstanceCounter.staticCounter

                        System.out.println(InstanceCounter.staticCounter);
                        System.out.println(InstanceCounter.staticCounter);
                        System.out.println(InstanceCounter.staticCounter);

                        //increment object counter 1

                        obj1.incrementObjectCounter();                    

                        //increment static counter = 1001t
                        
                        InstanceCounter.incrementStaticCounter();
                        InstanceCounter.incrementStaticCounter();
                        InstanceCounter.incrementStaticCounter();

	}
}
