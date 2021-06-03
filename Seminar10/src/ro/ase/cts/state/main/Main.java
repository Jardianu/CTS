package ro.ase.cts.state.main;

import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.StareLibera;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);

        masa.elibereazaMasa();

        masa.rezervaMasa();

        masa.rezervaMasa();

        masa.ocupaMasa();
    }
}
