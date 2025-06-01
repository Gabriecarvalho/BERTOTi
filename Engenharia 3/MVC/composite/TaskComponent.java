
package composite;

import strategy.PriorityStrategy;

public abstract class TaskComponent {
    public String name;
    protected PriorityStrategy priorityStrategy;

    public TaskComponent(String name, PriorityStrategy priorityStrategy) {
        this.name = name;
        this.priorityStrategy = priorityStrategy;
    }

    public abstract void show();
}
