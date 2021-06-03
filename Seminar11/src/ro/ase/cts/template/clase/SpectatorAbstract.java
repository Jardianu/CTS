package ro.ase.cts.template.clase;

public abstract class SpectatorAbstract {
    public abstract void seAseazaLaCoada();
    public abstract void prezentareBilet();
    public abstract void realizareControlCorporal();
    public abstract void ocupaLoc();

    public final void intrareInStadion() {
        seAseazaLaCoada();
        prezentareBilet();
        realizareControlCorporal();
        ocupaLoc();
    }
}
