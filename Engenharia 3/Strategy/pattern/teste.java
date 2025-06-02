package pattern;

public class teste{
    public static void main(String[] args) {

        Animal Aguia = new Animal();
        Aguia.setMovimentaççao(new MovimentaçaoVoar());
        Aguia.realizarMovimentaçao();

        Animal Cachorro = new Animal();
        Cachorro.setMovimentaççao(new MovimentaçaoCorrer());
        Cachorro.realizarMovimentaçao();

    }



}