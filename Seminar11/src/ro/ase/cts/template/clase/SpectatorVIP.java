package ro.ase.cts.template.clase;

public class SpectatorVIP extends SpectatorAbstract{
    private String nume;

    public SpectatorVIP(String nume) {
        this.nume = nume;
    }

    @Override
    public void seAseazaLaCoada() {
        System.out.println(nume + "nu a mai stat la coada pentru ca e VIP");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("Spectatorul " + this.nume + " a prezentat biletul");
    }

    @Override
    public void realizareControlCorporal() {
        System.out.println("Spectatorul " + this.nume + " a fost controlat");
    }

    @Override
    public void ocupaLoc() {
        System.out.println("Spectatorul " + this.nume + " a ocupat locul VIP");
    }
}
