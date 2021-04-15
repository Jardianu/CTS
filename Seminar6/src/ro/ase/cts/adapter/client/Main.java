package ro.ase.cts.adapter.client;

import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletAdapter;
import ro.ase.cts.adapter.clase.BiletAdapterClase;
import ro.ase.cts.adapter.clase.EBiletOnline;

public class Main {
    private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet) {
        bilet.rezervare();
        bilet.vanzare();
    }

    private static void rezervaSiAfiseazaBiletOnline(EBiletOnline eBiletOnline) {
        eBiletOnline.rezervaBiletOnline();
        eBiletOnline.vindeBiletOnine();
    }

    public static void main(String[] args) {
        Bilet bilet = new Bilet(30);
        rezervaSiAfiseazaBiletLaCasa(bilet);
        //eroare rezervaSiAfiseazaBiletOnline(bilet);

        EBiletOnline adapter = new BiletAdapter(bilet);
        rezervaSiAfiseazaBiletOnline(adapter);

        EBiletOnline adapterClase = new BiletAdapterClase(50);
        rezervaSiAfiseazaBiletOnline(adapterClase);
    }
}