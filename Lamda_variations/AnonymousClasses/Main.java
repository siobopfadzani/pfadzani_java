class AnonymousClass
{
	void print()
	{
		System.out.println(" Main");
	}
}
public class Main
{
	public static void main(String[] args) 
	{
		AnonymousClass anony = new AnonymousClass(){
			void print()
			{
				System.out.println("main 2");
			}
		};
		anony.print();
	}
}