package antipattern;

public class Cachorro extends Animal{
    public void Correr(){
        System.out.println("Correndo");
    }

    @Override
    void Voar(){
        //novamente nao ha utilizaçao porem gerando codigo repetido novamente
    }
}