package ro.ase.cts.main;

import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Main {
    public static void main(String[] args) {
        Presedinte presedinte1 = Presedinte.getInstance();
        Presedinte presedinte2 = Presedinte.getInstance();

        presedinte1.setNume("setnume1");
        presedinte2.setMandat(1);

//        System.out.println(presedinte1);
//        System.out.println(presedinte2);

        PresedinteLazy presedinteLazy1 = PresedinteLazy.getInstance("presedinteLazy", 40, 4);
        PresedinteLazy presedinteLazy2 = PresedinteLazy.getInstance("presedinteLazy22", 50, 1);

//        System.out.println(presedinteLazy1);
//        System.out.println(presedinteLazy2);
    }
}