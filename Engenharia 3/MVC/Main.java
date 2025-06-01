
import composite.*;
import observer.*;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        // Observers
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Gerenciador de tarefas
        TaskManager manager = new TaskManager();
        manager.addObserver(user1);
        manager.addObserver(user2);

        // Estratégias de prioridade
        PriorityStrategy alta = new HighPriority();
        PriorityStrategy baixa = new LowPriority();

        // Tarefas simples
        TaskComponent tarefa1 = new TaskLeaf("Corrigir bug", alta);
        TaskComponent tarefa2 = new TaskLeaf("Escrever documentação", baixa);

        // Tarefa composta
        TaskComposite projeto = new TaskComposite("Sprint 1", baixa);
        projeto.add(tarefa1);
        projeto.add(tarefa2);

        // Adicionar tarefas ao sistema
        manager.addTask(tarefa1);
        manager.addTask(projeto);
    }
}
