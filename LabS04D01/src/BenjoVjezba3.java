public class BenjoVjezba3 {
	public static void main(String[] args) {

		TextIO.readUserSelectedFile();

		String line = TextIO.getWord();
		String broj = TextIO.getWord();

		

		if (Integer.parseInt(broj) > 18) {
			System.out.println("Nista posebno");
		}else
			
			System.out.println("morate napustiti program");

		
	}
}
