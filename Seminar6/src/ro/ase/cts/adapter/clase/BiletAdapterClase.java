package ro.ase.cts.adapter.clase;

public class BiletAdapterClase extends Bilet implements EBiletOnline{
    public BiletAdapterClase(float pret) {
        super(pret);
    }

    @Override
    public void vindeBiletOnine() {
        super.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
        super.rezervare();
    }
}