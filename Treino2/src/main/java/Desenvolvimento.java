public class Desenvolvimento extends Tarefa implements Prioritaria{
    int prioridade;
    public Desenvolvimento(String descricao, String responsavel) {
        super(descricao, responsavel);
    }

    @Override
    public void definirPrioridade(int nivel) {
        this.prioridade = nivel;
        System.out.println("Nivel de Prioridade: "+prioridade);

    }

    @Override
    public void executar() {
        System.out.println("Tarefa de Desenvolvimento:");
        System.out.println("Descrição: "+descricao);
        System.out.println("Responsavel: "+responsavel);
        definirPrioridade(1);
        System.out.println("Executando tarefa de desenvolvimento...");
    }
}
