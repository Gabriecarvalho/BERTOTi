
package composite;

import java.util.ArrayList;
import java.util.List;
import strategy.PriorityStrategy;

public class TaskComposite extends TaskComponent {
    private List<TaskComponent> children = new ArrayList<>();

    public TaskComposite(String name, PriorityStrategy priorityStrategy) {
        super(name, priorityStrategy);
    }

    public void add(TaskComponent task) {
        children.add(task);
    }

    public void remove(TaskComponent task) {
        children.remove(task);
    }

    public void show() {
        System.out.print("Grupo de tarefas: " + name + " - ");
        priorityStrategy.executePriority();
        for (TaskComponent task : children) {
            task.show();
        }
    }
}
