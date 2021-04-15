package ro.ase.cts.adapter.clase;

public class BiletAdapter implements EBiletOnline{
    private Bilet bilet;

    public BiletAdapter(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vindeBiletOnine() {
        this.bilet.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
        this.bilet.rezervare();
    }
}