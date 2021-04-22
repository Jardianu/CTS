package ro.ase.cts.Command.clase;

public class Masa {
    private int numarMasa;
    private boolean esteOcupata;
    private boolean esteRezervata;

    public void ocupaMasa() {
        if(!this.esteOcupata) {
            System.out.println("Masa poate fi ocupata");
            this.esteOcupata = true;

        } else {
            System.out.println("Masa nu poate fi ocupata");
        }
    }

    public Masa(int numarMasa) {
        this.numarMasa = numarMasa;
        this.esteOcupata = false;
        this.esteRezervata = false;
    }

    public void rezervaMasa() {
        if(this.esteRezervata == false) {
            System.out.println("Masa poate fi rezervata");
            this.esteRezervata = true;
        } else {
            System.out.println("Masa nu poate fi rezervata");
        }
    }
}