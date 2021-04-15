package ro.ase.cts.proxy.clase;

public class OperatorCrediteProxy implements IOperatorCredite{
    private OperatorCredite operatorCredite;

    public OperatorCrediteProxy(OperatorCredite operatorCredite) {
        this.operatorCredite = operatorCredite;
    }

    @Override
    public void creareCredit(Moneda moneda, float suma) {
        if(moneda == Moneda.RON) {
            this.operatorCredite.creareCredit(moneda,suma);
        }
        else {
            System.out.println("Banca ofera credite exclusiv in RON");
        }
    }
}