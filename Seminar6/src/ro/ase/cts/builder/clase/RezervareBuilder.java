package ro.ase.cts.builder.clase;

public class RezervareBuilder implements AbstractBuilder {
    Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare(0, false,
                            false, false, false, "empty");
    }

    public RezervareBuilder(int cod) {
        this.rezervare = new Rezervare(cod, false,
                false, false, false, "empty");
    }

    public RezervareBuilder setCodRezervare(int cod) {
        rezervare.setCodRezervare(cod);
        return this;
    }

    public RezervareBuilder setAreMancare(boolean areMancare) {
        rezervare.setAreMancare(areMancare);
        return this;
    }

    public RezervareBuilder setAreBautura(boolean areBautura) {
        rezervare.setAreBautura(areBautura);
        return this;
    }

    public RezervareBuilder setAreMuzica(boolean areMuzica) {
        rezervare.setAreMuzicaAmbientala(areMuzica);
        return this;
    }

    public RezervareBuilder setAreScaun(boolean areScaun) {
        rezervare.setAreScaunErgonomic(areScaun);
        return this;
    }

    public RezervareBuilder setGenMuzica(String gen) {
        rezervare.setGenMuzica(gen);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}