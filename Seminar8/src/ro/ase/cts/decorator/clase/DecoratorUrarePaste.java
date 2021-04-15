package ro.ase.cts.decorator.clase;

public class DecoratorUrarePaste extends DecoratorAbstract {
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: Paste fericit!");
	}
	
	public DecoratorUrarePaste(INota nota) {
		super(nota);
	}
	
	

}
