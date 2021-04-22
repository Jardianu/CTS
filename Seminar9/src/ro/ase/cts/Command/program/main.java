package ro.ase.cts.Command.program;

import ro.ase.cts.Command.clase.*;
public class main {

	public static void main(String[] args) {
		Masa masa1 = new Masa(1);
        Masa masa2 = new Masa(2);
        Comanda comandaRezervare = new ComandaRezervare(masa1);
        Comanda comandaOcupare = new ComandaOcupare(masa2);
        Comanda comandaOcupare2 = new ComandaOcupare(masa2);

        Operator operator = new Operator();
        operator.invoca(comandaRezervare);
        operator.executaComanda();
        operator.invoca(comandaOcupare);
        operator.invoca(comandaOcupare2);

        operator.executaComanda();
        operator.executaComanda();

	}

}
