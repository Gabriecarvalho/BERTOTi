package pattern;

public class Animal{

    private Movimentacao movimentacao;

    public void setMovimentaççao(Movimentaçao movimentaçao){//argumento para mudar o tipo de movimentaçao
        this.movimentacao = movimentacao;
    }

    public void realizarMovimentaçao(){
        this.movimentaçao.mover();
    }





}