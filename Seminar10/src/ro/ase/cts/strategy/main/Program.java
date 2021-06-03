package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataCash;

public class Program {
    public static void main(String[] args) {
        Client client = new Client("V");

        client.plateste(124);
        client.setTipPlata(new PlataCash());
        client.plateste(222);
    }
}
