package application;

public class Princiapal {

	public static void main(String[] args) {
		String[] vect = new String[] { "maria", "bob", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println((i + 1) + "-" + vect[i]);
		}

		for (String nomes : vect) {
			System.out.println(nomes.indexOf(0));

		}
	}
}
