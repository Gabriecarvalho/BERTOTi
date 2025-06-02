package observerpattern;

import java.io.File;

public class LogOpenListener implements EventListener {
    private String log;

    public LogOpenListener(String logFilePath) {
        this.log = logFilePath;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Gravando no log [" + log + "]: " + eventType + " em arquivo " + file.getName());
    }
}