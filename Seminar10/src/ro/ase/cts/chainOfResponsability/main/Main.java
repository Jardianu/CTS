package ro.ase.cts.chainOfResponsability.main;

import ro.ase.cts.chainOfResponsability.clase.Client;
import ro.ase.cts.chainOfResponsability.clase.NotificatorEmail;
import ro.ase.cts.chainOfResponsability.clase.NotificatorSMS;


public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Ion", null, null);
        Client client2 = new Client("Ana", "072727373", null);
        Client client3 = new Client("Maria", null, "asd@gmail.com");

        NotificatorSMS notificatorSMS = new NotificatorSMS();
        NotificatorEmail notificatorEmail = new NotificatorEmail();
        notificatorSMS.setNotificator(notificatorEmail);
        notificatorSMS.trimiteNotificare(client2, "Mesaj1");


    }
}
