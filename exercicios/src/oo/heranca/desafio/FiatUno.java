package oo.heranca.desafio;

public class FiatUno extends Carro{
    // recebeu atributos e comportamentos
    public FiatUno(){
        this(212);
    }

    public FiatUno(int velocidadeMaxima){
        super(velocidadeMaxima); //importando a classe pai(super)
    }

}
