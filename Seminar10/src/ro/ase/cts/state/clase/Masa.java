package ro.ase.cts.state.clase;

public class Masa {
    private Stare stare;
    private int numar;

    public Masa(int numar) {
        this.numar = numar;
        this.stare = new StareLibera();
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public void rezervaMasa() {
        new StareRezervata().modificaStare(this);
    }

    public void ocupaMasa() {
        new StareOcupata().modificaStare(this);
    }

    public void elibereazaMasa() {
        new StareLibera().modificaStare(this);
    }
}
