package ro.ase.cts.prototype;

public class Client {

	public static void main(String[] args) {
		 Reteta reteta = new Reteta("Paracetamol", 250);
	        PrototipAbstract retetaCopie = reteta.copiaza();

	        System.out.println(reteta);
	        System.out.println(retetaCopie);

	}

}
