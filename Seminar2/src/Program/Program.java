package Program;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	private static List<Aplicant> readApplicants(IReader reader) throws FileNotFoundException {
		return reader.readApplicants();
	}

	public static void main(String[] args) {
		System.out.println(Student.getSUmaFinantata());
		System.out.println(Elev.getSUmaFinantata());
		System.out.println(Angajat.getSUmaFinantata());
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = readApplicants(new AngajatiReader("angajati.txt"));
			Proiect proiect = new Proiect(81);

			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantare());

				aplicant.afisareRaspunsProiect(proiect);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}