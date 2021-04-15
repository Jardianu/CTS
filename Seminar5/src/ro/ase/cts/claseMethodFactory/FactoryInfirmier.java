package ro.ase.cts.claseMethodFactory;

public class FactoryInfirmier implements IFactory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Infirmier(nume);
    }
}