package ro.ase.cts.claseMethodFactory;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "\nBrancardier: " + super.getNume();
    }
}