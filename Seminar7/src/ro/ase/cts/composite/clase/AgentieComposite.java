package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class AgentieComposite implements IfSediu{
    private List<IfSediu> listaSedii;

    public AgentieComposite() {
        this.listaSedii = new ArrayList<>();
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Este o agentie");
        for(IfSediu sediu : listaSedii) {
            sediu.afiseazaDescriere();
        }
    }

    @Override
    public void adaugaNod(IfSediu sediu) {
        listaSedii.add(sediu);
    }

    @Override
    public void stergeNod(IfSediu sediu) {
        listaSedii.remove(sediu);
    }

    @Override
    public IfSediu getNod(int pozitie) {
        return listaSedii.get(pozitie);
    }
}