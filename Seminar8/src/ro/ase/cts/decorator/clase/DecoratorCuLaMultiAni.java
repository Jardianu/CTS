package ro.ase.cts.decorator.clase;

public class DecoratorCuLaMultiAni extends DecoratorAbstract {
	
	public DecoratorCuLaMultiAni(INota notaDePlata) {
		super(notaDePlata);
	}
	
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: La multi ani");
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("La multi ani");
	}
}
