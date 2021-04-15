package ro.ase.cts.facade.clase;

public class VerificatorPersoaneFacade {
    public static boolean esteEligibil(Persoana persoana) {
        if(persoana.getVarsta() >= 18) {
            if(!Politie.esteUrmarit(persoana)) {
                if(!BirouDeCredite.areCredite(persoana)) {
                    return true;
                }
            }
        }

        return false;
    }
}