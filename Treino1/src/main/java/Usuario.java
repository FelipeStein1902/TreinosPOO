import java.util.ArrayList;

public class Usuario {
    String nome;
    ArrayList<Notificacao> notification = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void addNotificacao(Notificacao n){
        notification.add(n);
    }
    public void enviarNotificacoes(){
        System.out.println("------=------");
        for (Notificacao n: notification){
            n.enviar();
            if (n instanceof IAutenticavel){
                ((IAutenticavel) n).autenticar();
            }

        }
    }
}
