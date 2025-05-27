import java.util.ArrayList;

public class Projeto {
    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa t){
        tarefas.add(t);
    }

    public void executarTarefas(){
        System.out.println("Executando tarefas do projeto:");
        for (Tarefa t: tarefas)
            t.executar();
        }
    }

