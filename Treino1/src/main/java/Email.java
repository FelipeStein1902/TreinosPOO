public class Email extends Notificacao implements IAutenticavel{
    public Email(String destinatario) {
        super(destinatario);
    }

    public void enviar(){
        System.out.println("Email enviado com sucesso!");

    }

    @Override
    public void autenticar() {
        System.out.println("Autenticando Email...");
    }
}
