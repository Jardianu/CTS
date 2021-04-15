package ro.ase.cts.facade.client;

import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.VerificatorPersoaneFacade;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Pop","19510167555555");
        if(VerificatorPersoaneFacade.esteEligibil(persoana)) {
            System.out.println("Persoana este eligibila");
        }
        else {
            System.out.println("Persoana nu este eligibila");
        }
    }
}