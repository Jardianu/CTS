package ro.ase.cts.proxy.clase;

public class OperatorCredite implements IOperatorCredite{

    @Override
    public void creareCredit(Moneda moneda, float suma) {
        System.out.println("A fost realizazt creditul in valoare de " + suma + " " + moneda);
    }
}