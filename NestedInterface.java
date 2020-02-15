
public class NestedInterface {

	public static void main(String[] args) {
		son s1 = new son();
		s1.qualities();
	}

}

class Grandfather{
	public interface father{
		public void qualities();
		String passion = "Gutarist";
	}
}

class son implements Grandfather.father{
	public void qualities() {
		System.out.println("I am son");
		System.out.println("Passion of Father in Son: "+passion);
	}
}
