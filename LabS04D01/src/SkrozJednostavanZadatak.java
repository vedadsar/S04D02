public class SkrozJednostavanZadatak {

	public static void main(String[] args) {
		
		try {
			int prviBroj = Integer.parseInt(args[0]);
			prostBroj(prviBroj);

		} catch (NumberFormatException e) {
			System.out.println("Greska");
		}
		
		int unos = 1;
		while (unos != 0) {
			System.out.println("Unesite vas broj");
			unos = TextIO.getInt();
			prostBroj(unos);
		}

	}

	public static boolean prostBroj(int broj) {

		boolean isPrime = true;

		for (int i = 2; i < broj; i++) {

			if (broj % i == 0) {
				isPrime = false;
				System.out.println("broj nije prime");
				break;
			}

		}
		if (isPrime) {
			System.out.println("Broj je prost");
			return isPrime;
		}

		return isPrime;

	}

}
