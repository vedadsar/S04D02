public class Zadatak {

	public static void sabiranje(int a, int b) {
		int suma = a + b;
		System.out.println("Zbir je " + suma);
	}

	public static void oduzimanje(int a, int b) {
		int razlika = a - b;
		System.out.println("razlika je " + razlika);
	}

	public static void dijeljenje(int a, int b) {
		int produkt = a / b;
		System.out.println("Produkt je " + produkt);
	}

	public static void mnozenje(int a, int b) {
		int proizvod = (a * b);
		System.out.println("Proizvod je " + proizvod);
	}

	public static void modul(int a, int b) {
		int modul = a % b;
		System.out.println("Modul je " + modul);
	}

	public static void stepenovanje(int a, int b) {
		int stepen = 1;

		for (int i = 1; i <= b; i++) {
			stepen = stepen * a;
		}
		System.out.println("Zbir je " + stepen);
	}

	public static void main(String[] args) {
		
		if (args[2].equals("+"))
			sabiranje(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

		if (args[2].equals("-"))
			oduzimanje(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

		if (args[2].equals("/"))
			dijeljenje(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

		if (args[2].equals("*"))
			mnozenje(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

		if (args[2].equals("%"))
			modul(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

		if (args[2].equals("^"))
			stepenovanje(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

	}
}
