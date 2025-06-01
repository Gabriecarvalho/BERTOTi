
import composite.TaskComponent;
import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class TaskManager implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void addTask(TaskComponent task) {
        System.out.println("\n Nova tarefa adicionada:");
        task.show();
        notifyObservers("Nova tarefa: " + task.name);
    }
}
