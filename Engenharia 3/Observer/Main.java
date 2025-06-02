package observerpattern;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.events.subscribe("open", new LogOpenListener("/path/to/log.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@empresa.com"));

        editor.openFile("teste.txt");
        try {
            editor.saveFile();
        } catch (Exception e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }
}