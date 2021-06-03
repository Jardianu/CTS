package ro.ase.cts.chainOfResponsability.clase;

public class NotificatorEmail extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String text) {
        if(client.getEmail() != null) {
            System.out.println("Trimitere email catre clientul " + client.getNume() + "; text: " + text);
        } else {
            if(super.getNotificator() != null) {
                super.getNotificator().trimiteNotificare(client, text);
            } else {
                System.out.println("Notificarea se trmiite catre manager pentru clientul " + client.getNume());
            }
        }
    }
}
