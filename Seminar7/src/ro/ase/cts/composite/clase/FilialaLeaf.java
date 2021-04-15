package ro.ase.cts.composite.clase;


public class FilialaLeaf implements IfSediu{
    private String numeFiliala;

    public FilialaLeaf(String numeFiliala) {
        this.numeFiliala = numeFiliala;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Este o filiala - " + this.numeFiliala);
    }

    @Override
    public void adaugaNod(IfSediu sediu) throws Exception {
        throw new Exception("Nu este implementat");
    }

    @Override
    public void stergeNod(IfSediu sediu) throws Exception{
        throw new Exception("Nu este implementat");
    }

    @Override
    public IfSediu getNod(int poz) throws Exception {
        throw new Exception("Nu este implementat");
    }
}