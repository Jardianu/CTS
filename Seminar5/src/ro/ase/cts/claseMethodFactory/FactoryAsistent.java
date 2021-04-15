package ro.ase.cts.claseMethodFactory;

public class FactoryAsistent implements IFactory {

    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Asistent(nume);
    }
}