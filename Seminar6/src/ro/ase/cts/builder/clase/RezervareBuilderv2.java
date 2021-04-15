package ro.ase.cts.builder.clase;

public class RezervareBuilderv2 implements AbstractBuilder{
    //incalcam DRY
    private int codRezervare;
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areBautura;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    public RezervareBuilderv2() {
        this.codRezervare = 0;
        areMancare = false;
        areScaunErgonomic = false;
        areBautura= false;
        areMuzicaAmbientala = false;
        genMuzica = "empty";
    }

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare, areMancare, areScaunErgonomic, areBautura, areMuzicaAmbientala, genMuzica);
    }

    public RezervareBuilderv2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public RezervareBuilderv2 setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
        return this;
    }

    public RezervareBuilderv2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public RezervareBuilderv2 setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
        return this;
    }

    public RezervareBuilderv2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public RezervareBuilderv2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }
}