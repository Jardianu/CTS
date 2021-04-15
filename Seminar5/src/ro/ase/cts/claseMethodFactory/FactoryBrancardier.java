package ro.ase.cts.claseMethodFactory;

public class FactoryBrancardier implements IFactory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Brancardier(nume);
    }
}
