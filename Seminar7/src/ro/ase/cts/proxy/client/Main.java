package ro.ase.cts.proxy.client;

import ro.ase.cts.proxy.clase.Moneda;
import ro.ase.cts.proxy.clase.OperatorCredite;
import ro.ase.cts.proxy.clase.OperatorCrediteProxy;

public class Main {
    public static void main(String[] args) {
        OperatorCredite operatorCredite = new OperatorCredite();

        operatorCredite.creareCredit(Moneda.EUR, 4000);

        OperatorCrediteProxy operatorCrediteProxy = new OperatorCrediteProxy(operatorCredite);
        operatorCrediteProxy.creareCredit(Moneda.EUR, 4000);
        operatorCrediteProxy.creareCredit(Moneda.RON, 4000);
    }
}
