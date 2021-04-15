package ro.ase.cts.facade.clase;

class Politie {
    //politie si birou nu sunt clase publice
    public static boolean esteUrmarit(Persoana persoana) {
        return (Integer.parseInt("" + persoana.getCnp().charAt(12))) % 2 == 0;
    }
}