package oo.composicao;

public class Item {

    String nome;
    int quantidade;
    double preco;
    Compra compra;

    Item(String nome, int quantidade, double preco) { //construtor criado
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

}
