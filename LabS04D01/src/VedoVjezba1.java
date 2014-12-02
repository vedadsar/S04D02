import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class VedoVjezba1 {

	public static void main(String[] args) {

		FileWriter fw;

		try {
			fw = new FileWriter(new File("test.txt"));
			fw.append("Evo jedan red");
			fw.append('\n');
			fw.flush();
			String unos = TextIO.getln();
			fw.append(unos);
			fw.append('\n');
			fw.append("Drugi red\nI treci red. ");
			fw.append('\n');			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
