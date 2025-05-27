public class SMS extends Notificacao implements IAutenticavel{
    public SMS(String destinatario) {
        super(destinatario);
    }

    public void enviar(){
        System.out.println("SMS enviado com sucesso!");

    }

    @Override
    public void autenticar() {
        System.out.println("Autenticando SMS...");
    }
}
