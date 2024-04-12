
 public class Lion extends Animal
 {
 	private String name;

 	public void setName(String a)
 	{
 		this.name = a;
 	}

 	public void roar()
 	{
 		System.out.println(" Thw lion with name " + this.name +" is " + getAge() + "years old");
 	}
 	public void display(String a)
 	{
 		this.type = a;
 		System.out.println(" the lion is a " + this.type);
 	}

 }