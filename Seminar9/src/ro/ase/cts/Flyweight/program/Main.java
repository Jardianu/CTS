package ro.ase.cts.Flyweight.program;

import ro.ase.cts.Flyweight.clase.Flyweight;
import ro.ase.cts.Flyweight.clase.FlyweightFactory;
import ro.ase.cts.Flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(10, 5, 15);
		Rezervare rezervare2 = new Rezervare(42, 6, 13);
		Rezervare rezervare3 = new Rezervare(19, 2, 14);
		Rezervare rezervare4 = new Rezervare(14, 3, 20);
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		Flyweight client1 = flyweightFactory.getClient("0745273744");
		
		client1.printeazaRezervare(rezervare1);
		
		flyweightFactory.getClient("0745273744").printeazaRezervare(rezervare2);
		flyweightFactory.getClient("0745273734").printeazaRezervare(rezervare3);
		flyweightFactory.getClient("0745273734").printeazaRezervare(rezervare4);
		
	}

}
