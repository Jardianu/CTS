package ro.ase.cts.state.clase;

public class StareRezervata implements Stare{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera) {
            System.out.println("Masa cu nr " + masa.getNumar() + " este rezervata");
            masa.setStare(this);
        } else {
            System.out.println("Nu putem rezerva masa");
        }
    }
}
