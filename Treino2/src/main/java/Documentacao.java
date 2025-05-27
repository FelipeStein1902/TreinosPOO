public class Documentacao extends Tarefa {
    public Documentacao(String descricao, String responsavel) {
        super(descricao, responsavel);
    }

    @Override
    public void executar() {
        System.out.println("Tarefa de Documentação:");
        System.out.println("Descrição: "+descricao);
        System.out.println("Responsavel: "+responsavel);
        System.out.println("Executando tarefa de Documentação...");
    }
}
