public class Leitor implements Observer {
    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    public void update(String article) {
        System.out.println(nome + " recebeu: " + article);
    }
}

