public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        Leitor leitor1 = new Leitor("LeitorA");
        Leitor leitor2 = new Leitor("LeitorB");

        editor.addObserver(leitor1);
        editor.addObserver(leitor2);

        editor.publishArticle("Artigo sobre Java Observer!");
    }
}
