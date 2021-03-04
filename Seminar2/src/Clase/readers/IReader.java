package Clase.readers;


import java.io.FileNotFoundException;
import java.util.List;

import Clase.Aplicant;

public interface IReader {
    List<Aplicant> readApplicants(String filename) throws FileNotFoundException, NumberFormatException;
}