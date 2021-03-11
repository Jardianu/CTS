package Clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsReader extends IReader{

    public StudentsReader(String filePath) {
        super(filePath);
    }

    @Override
    public List<Aplicant> readApplicants() throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(super.filePath));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student s = new Student();
            super.citireAplicant(input, s);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            s.setAn_studii(an_studii);
            s.setFacultate(facultate);
            studenti.add(s);
        }
        input.close();
        return studenti;
    }
}