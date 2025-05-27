public class Teste extends Tarefa implements Prioritaria {
    int prioridade;

    public Teste(String descricao, String responsavel) {
        super(descricao, responsavel);
    }

    @Override
    public void definirPrioridade(int nivel) {
        this.prioridade = nivel;
        System.out.println("Nivel de prioridade: "+nivel);
    }

    @Override
    public void executar() {
        System.out.println("Tarefa de Teste:");
        System.out.println("Descrição: "+descricao);
        System.out.println("Responsavel: "+responsavel);
        definirPrioridade(2);
        System.out.println("Executando tarefa de Teste...");
    }
}
