
public class UnosKorisnika {

	public static void main(String[] args) {
		TextIO.writeUserSelectedFile();
		System.out.println("Unesite vase ime i prezime");
		String imeIPrezime = TextIO.getlnString();
		TextIO.putln(imeIPrezime);
		System.out.println("Koliko godina imate ");
		String godine = TextIO.getlnString();
		TextIO.putln(godine);
		System.out.println("Sta radis");
		String staRadis = TextIO.getlnString();
		TextIO.putln(staRadis);
	}
	
	
}
