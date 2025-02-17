package antipattern;

public class Aguia extends Animal{
    
    @Override
    void Correr() {
        //deixar vazia pois aguia nao corre e acaba gerando codigo a mais
    }

    public void Voar(){
        System.out.println("Voando");
    }
}