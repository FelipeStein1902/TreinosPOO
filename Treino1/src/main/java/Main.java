public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Carlos");
        usuario1.addNotificacao(new Email("carlos@email.com"));
        usuario1.addNotificacao(new SMS("+5511999999999"));
        usuario1.addNotificacao(new PushNotification("token_dispositivo_123"));

        System.out.println("Enviando notificações para Carlos:");
        usuario1.enviarNotificacoes();


    }
}
