package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements INota {
	
	private INota nota;
	
	public DecoratorAbstract(INota nota) {
		this.nota = nota;
	}
	
	public void printeaza() {
		nota.printeaza();
	}
	
	public void printeazaFelicitare() {
		
	}
}
