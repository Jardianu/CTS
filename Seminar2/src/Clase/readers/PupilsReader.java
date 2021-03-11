package Clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Clase.Aplicant;
import Clase.Elev;

public class PupilsReader extends IReader {

    public PupilsReader(String filePath) {
        super(filePath);
    }

    @Override
    public List<Aplicant> readApplicants() throws FileNotFoundException, NumberFormatException {
        Scanner input2 = new Scanner(new File(super.filePath));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev e = new Elev();
            super.citireAplicant(input2, e);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            e.setClasa(clasa);
            e.setTutore(tutore);
            elevi.add(e);
        }

        input2.close();
        return elevi;
    }
}