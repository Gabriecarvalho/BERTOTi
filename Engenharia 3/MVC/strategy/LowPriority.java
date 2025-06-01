
package strategy;

public class LowPriority implements PriorityStrategy {
    public void executePriority() {
        System.out.println("Tarefa com baixa prioridade.");
    }
}
