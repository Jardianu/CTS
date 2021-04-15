package ro.ase.cts.composite.clase;

public interface IfSediu {
	public void afiseazaDescriere();
    public void adaugaNod(IfSediu sediu) throws Exception;
    public void stergeNod(IfSediu sediu) throws Exception;
    public IfSediu getNod(int poz) throws Exception;
}
