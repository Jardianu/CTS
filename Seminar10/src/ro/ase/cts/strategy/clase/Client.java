package ro.ase.cts.strategy.clase;

public class Client {
    private IPlata tipPlata;
    private String nume;

    public Client(String nume) {
        this.nume = nume;
        this.tipPlata = new PlataCard();
    }

    public void setTipPlata(IPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void plateste(float suma) {
        tipPlata.plateste(suma);
    }
}
