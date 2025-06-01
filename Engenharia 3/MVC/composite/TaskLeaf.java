
package composite;

import strategy.PriorityStrategy;

public class TaskLeaf extends TaskComponent {

    public TaskLeaf(String name, PriorityStrategy priorityStrategy) {
        super(name, priorityStrategy);
    }

    public void show() {
        System.out.print("Tarefa: " + name + " - ");
        priorityStrategy.executePriority();
    }
}
