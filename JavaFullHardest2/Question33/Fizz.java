

class Foo {
    int a = 5;
    protected int b = 6;
}

public class Fizz extends Foo {
    public static void main(String[] args) {

		Foo f = new Foo();
		System.out.print(" "+f.a);
		System.out.print(" "+f.b);
		// System.out.print(" "+ new Fiz().a);
		System.out.print(" "+ new Fizz().b);
	}
}
