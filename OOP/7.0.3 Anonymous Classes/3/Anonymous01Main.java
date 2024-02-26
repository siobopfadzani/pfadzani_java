public class Anonymous01Main {
	public static void main(String[] args) {
		
		Anonymous01 superX = new Anonymous01()
        {	
			public void doSomething() 
			{
				
				System.out.println(name +":Doing something ...");
			}
		};
		
		
		superX.doSomething();
	}
}
