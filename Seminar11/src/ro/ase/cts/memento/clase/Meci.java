package ro.ase.cts.memento.clase;

public class Meci {
    private String echipaGazda;
    private String echipaOaspeti;
    private int nrBileteVandute;
    private int nrSpectatori;
    private int nrJandarmi;
    private int nrStewarzi;

    public Meci(String echipaGazda, String echipaOaspeti, int nrBileteVandute, int nrSpectatori, int nrJandarmi, int nrStewarzi) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspeti = echipaOaspeti;
        this.nrBileteVandute = nrBileteVandute;
        this.nrSpectatori = nrSpectatori;
        this.nrJandarmi = nrJandarmi;
        this.nrStewarzi = nrStewarzi;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public void setEchipaOaspeti(String echipaOaspeti) {
        this.echipaOaspeti = echipaOaspeti;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    public void setNrStewarzi(int nrStewarzi) {
        this.nrStewarzi = nrStewarzi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meci{");
        sb.append("echipaGazda='").append(echipaGazda).append('\'');
        sb.append(", echipaOaspeti='").append(echipaOaspeti).append('\'');
        sb.append(", nrBileteVandute=").append(nrBileteVandute);
        sb.append(", nrSpectatori=").append(nrSpectatori);
        sb.append(", nrJandarmi=").append(nrJandarmi);
        sb.append(", nrStewarzi=").append(nrStewarzi);
        sb.append('}');
        return sb.toString();
    }

    public Memento creeazaMemento() {
        Memento memento = new Memento(this.nrSpectatori, echipaGazda, echipaOaspeti);
        return memento;
    }

    public void seteazaMemento(Memento memento) {
        nrSpectatori = memento.getNrSpectatori();
        echipaGazda = memento.getNumeEchipaGazda();
        echipaOaspeti = memento.getNumeEchipaOaspeti();
    }
}
