package Clase.readers;


import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import Clase.Aplicant;

public abstract class IReader {
    protected String filePath;

    public IReader(String filePath) {
        this.filePath = filePath;
    }

    public abstract List<Aplicant> readApplicants() throws FileNotFoundException, NumberFormatException;

    public void citireAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setVectorDenumiri(vect, nr);
    }
}