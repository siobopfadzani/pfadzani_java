public class Nested1Main {
	public static void main(String[] args) {
        Nested1 nest = new Nested1();
		Nested1.Inner inner = nest.new Inner();
	}
}
