package ro.ase.cts.claseMethodFactory;

public class Client {

    public static void afisareInformatiiPersonalSpital(IFactory factory, String nume) {
        PersonalSpital personalSpital = factory.createPersonal(nume);

        System.out.println(personalSpital.toString());
    }

    public static void main(String[] args) {
        afisareInformatiiPersonalSpital(new FactoryAsistent(), "Mircea");
        afisareInformatiiPersonalSpital(new FactoryBrancardier(), "Mihai");
        afisareInformatiiPersonalSpital(new FactoryInfirmier(), "Infirmier");
    }
}
