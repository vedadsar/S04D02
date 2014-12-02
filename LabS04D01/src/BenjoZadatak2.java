import java.util.InputMismatchException;


public class BenjoZadatak2 {

			public static void main(String[] args) {
				int suma = 0;
				int broj = 0;
			
				
				for(int i=0;i<args.length;i++){
					try {
					broj = Integer.parseInt(args[i]);
					suma += broj;
					} catch (NumberFormatException e) {
						System.out.println("Greska pri unosu broja " +args[i]);
					}				
				}
				
				
				
			
			System.out.println("Suma integera koje ste unijeli je " +suma);
					
			}

		}

	