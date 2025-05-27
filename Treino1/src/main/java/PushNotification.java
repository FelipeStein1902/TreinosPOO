public class PushNotification extends Notificacao{
    public PushNotification(String destinatario) {
        super(destinatario);
    }
    public void enviar(){
        System.out.println("SPush Notification enviada com sucesso!");

    }
}
