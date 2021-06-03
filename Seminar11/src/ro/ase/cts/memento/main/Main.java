package ro.ase.cts.memento.client;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.Meci;

public class Main {
    public static void main(String[] args) {
        Meci meci = new Meci("ecGzda", "ecOasp", 200,200,10,5);

        ManagerMemento managerMemento = new ManagerMemento();
        managerMemento.adaugaMemento(meci.creeazaMemento());

        meci.setNrSpectatori(100);
        managerMemento.adaugaMemento(meci.creeazaMemento());

        System.out.println(meci);
        meci.seteazaMemento(managerMemento.cereUnMemento(0));
        System.out.println(meci);
        meci.seteazaMemento(managerMemento.cereUltimulMemento());
        System.out.println(meci);
    }
}
