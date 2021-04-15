package ro.ase.cts.prototype;

public class Reteta implements PrototipAbstract{
    private String denumireSolutie;
    private int cantitateSolutie;

    public Reteta(String denumireSolutie, int cantitateSolutie) {
        //validari care consuma timp
        //de aceea vom face copierea, care nu va consuma acelasi timp
        this.denumireSolutie = denumireSolutie;
        this.cantitateSolutie = cantitateSolutie;
    }

    private Reteta() {
        //nu mai face validari;
        //nu poate fi apelat din exterior...
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumireSolutie='").append(denumireSolutie).append('\'');
        sb.append(", cantitateSolutie=").append(cantitateSolutie);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public PrototipAbstract copiaza() {
        Reteta copie = new Reteta();//(fara validari...=>nu consuma timp)
        copie.cantitateSolutie = this.cantitateSolutie;
        copie.denumireSolutie = this.denumireSolutie;

        return copie;
    }
}