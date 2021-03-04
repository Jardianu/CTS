package main;

public class main {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		Girafa g1 = new Girafa("girafa1");
		Girafa g2 = new Girafa("girafa2");
		
		zoo.AdaugaAnimal(g1);
		zoo.AdaugaAnimal(g2);
		
		Zebra z1 = new Zebra("zb1",1);
		Zebra z2 = new Zebra("zb1",22);
		
		zoo.feedAllAnimals();
	}

}
