package Program;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	private static List<Aplicant> readApplicants(IReader reader) throws FileNotFoundException {
		return reader.readApplicants();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = readApplicants(new AngajatiReader("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantare());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}