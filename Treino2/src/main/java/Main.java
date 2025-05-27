public class Main {
    public static void main(String[] args) {
                Projeto projeto = new Projeto();

                Tarefa tarefa1 = new Desenvolvimento("Implementar login", "Alice");
                Tarefa tarefa2 = new Teste("Testar módulo de pagamento", "Bob");
                Tarefa tarefa3 = new Documentacao("Escrever manual do usuário", "Carol");

                projeto.adicionarTarefa(tarefa1);
                projeto.adicionarTarefa(tarefa2);
                projeto.adicionarTarefa(tarefa3);

                projeto.executarTarefas();
            }
        }




