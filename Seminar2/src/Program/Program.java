package Program;

import java.io.FileNotFoundException;
import java.util.List;

import Clase.Angajat;
import Clase.Aplicant;
import Clase.readers.AngajatiReader;
import Clase.readers.IReader;

public class Program {

	private static List<Aplicant> readApplicants(IReader reader) throws FileNotFoundException {
		return reader.readApplicants();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = readApplicants(new AngajatiReader("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}