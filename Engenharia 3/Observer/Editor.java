package observerpattern;

import java.io.File;
import java.io.IOException;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws IOException {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new IOException("Nenhum arquivo aberto para salvar.");
        }
    }
}