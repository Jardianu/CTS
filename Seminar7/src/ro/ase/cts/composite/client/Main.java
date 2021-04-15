package ro.ase.cts.composite.client;

import ro.ase.cts.composite.clase.AgentieComposite;
import ro.ase.cts.composite.clase.FilialaLeaf;

public class Main {
    public static void main(String[] args) {
        AgentieComposite agentieComposite1 = new AgentieComposite();
        AgentieComposite agentieComposite2 = new AgentieComposite();
        AgentieComposite agentieComposite3 = new AgentieComposite();

        FilialaLeaf filialaLeaf1 = new FilialaLeaf("1fil1");
        FilialaLeaf filialaLeaf2 = new FilialaLeaf("2fil1");
        FilialaLeaf filialaLeaf3 = new FilialaLeaf("3fil1");
        FilialaLeaf filialaLeaf4 = new FilialaLeaf("4fil1");

        agentieComposite1.adaugaNod(filialaLeaf1);
        agentieComposite1.adaugaNod(filialaLeaf2);
        agentieComposite2.adaugaNod(filialaLeaf3);

        agentieComposite3.adaugaNod(agentieComposite2);

        agentieComposite3.afiseazaDescriere();

        agentieComposite2.stergeNod(filialaLeaf3);

        agentieComposite2.afiseazaDescriere();

    }
}
