import java.util.ArrayList;
import java.util.List;

public class Editor implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String article) {
        for (Observer observer : observers) {
            observer.update(article);
        }
    }

    public void publishArticle(String article) {
        System.out.println("Editor publicou: " + article);
        notifyObservers(article);
    }
}
