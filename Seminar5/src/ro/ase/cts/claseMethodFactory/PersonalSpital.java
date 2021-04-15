package ro.ase.cts.claseMethodFactory;

public abstract class PersonalSpital {
    private String nume;

    public PersonalSpital(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}