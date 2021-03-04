package Clase.readers;


import java.io.FileNotFoundException;
import java.util.List;

import Clase.Aplicant;

public abstract class IReader {
    protected String filePath;

    public IReader(String filePath) {
        this.filePath = filePath;
    }

    public abstract List<Aplicant> readApplicants() throws FileNotFoundException, NumberFormatException;
}