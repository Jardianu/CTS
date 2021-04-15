package ro.ase.cts.claseMethodFactory;

public class FactoryMedic implements IFactory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Medic(nume);
    }
}