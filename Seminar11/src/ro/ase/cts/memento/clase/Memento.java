package ro.ase.cts.memento.clase;

public class Memento {
    private int nrSpectatori;
    private String numeEchipaGazda;
    private String numeEchipaOaspeti;

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }

    public String getNumeEchipaOaspeti() {
        return numeEchipaOaspeti;
    }

    public Memento(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspeti) {
        this.nrSpectatori = nrSpectatori;
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }
}
