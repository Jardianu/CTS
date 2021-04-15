package ro.ase.cts.decorator.clase;

public class NotaDePlata implements INota {
	private int sumaDePlata;

	public NotaDePlata(int sumaDePlata) {
		this.sumaDePlata = sumaDePlata;
	}
	
	public void printeaza() {
		System.out.println("S-a printat nota de plata cu suma" + sumaDePlata);
	}
	
}
