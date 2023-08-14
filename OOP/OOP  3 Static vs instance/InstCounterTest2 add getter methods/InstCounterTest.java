public class InstCounterTest {
	public static void main(String[] args) {
		InstanceCounter obj1 = new InstanceCounter();
		InstanceCounter obj2 = new InstanceCounter();
		InstanceCounter obj3 = new InstanceCounter();

                        //sysout InstanceCounter.staticCounter
			System.out.println("Static " + InstanceCounter.staticCounter);
                         InstanceCounter.staticCounter = 1000;

                        //sysout InstanceCounter.staticCounter
			System.out.println("static " + InstanceCounter.staticCounter);
                        //increment object counter 1
                        
			InstanceCounter.staticCounter++;
			
                        //increment static counter = 1001
			InstanceCounter.staticCounter =1001;
	}
}

