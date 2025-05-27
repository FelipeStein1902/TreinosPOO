abstract class Tarefa {
    String descricao;
    String responsavel;

    public Tarefa(String descricao, String responsavel) {
        this.descricao = descricao;
        this.responsavel = responsavel;
    }
    public abstract void executar();
}
