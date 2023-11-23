public class question64
{
	public static void main(String[]args)
	{
		byte b = 127;
		int a = 127;
		String s = "127";

		boolean bool =( b > a ? true:false);
		if(!bool){
			switch(s){
			case "":
				System.out.println("i am an iteger");
			case "197":
				System.out.println("i am a string");
				break;
			default :
				System.out.println("i am an default");
			case "127":
				System.out.println("i am an byte");
			

			}
		}
	}
}