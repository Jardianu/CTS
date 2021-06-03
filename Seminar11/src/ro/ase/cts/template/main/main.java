package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVIP;

public class main {
    public static void main(String[] args) {
        SpectatorAbstract spectator = new Spectator("SpectatorSimplu");
        spectator.intrareInStadion();
        SpectatorAbstract spectatorVip = new SpectatorVIP("SpectatorVIP");
        spectatorVip.intrareInStadion();

    }
}
