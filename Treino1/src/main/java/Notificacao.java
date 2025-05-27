abstract class Notificacao {
    String destinatario;

    public Notificacao(String destinatario){
        this.destinatario = destinatario;
    }

    abstract void enviar();
}
