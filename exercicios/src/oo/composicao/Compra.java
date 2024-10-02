package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;

    ArrayList<Item> itens = new ArrayList<Item>(); //criacao de array para item

    //ADD ITENS A COMPRA - > RELACAO BIDIRECIONAL
    void adicionarItem(Item item) { //deixo de fazer a relacao 1x1 pelo void e comeca a ser bidireconal
        this.itens.add(item);       //apenas um exemplo
        item.compra = this;
    }

    void adicionarItem(String nome, int quantidade, double preco){ // detalhar a compra
        this.adicionarItem(new Item(nome, quantidade, preco)); // esse metodo chamou o metodo de cima

    }

    double obterValorTotal(){
        double total = 0;

        for (Item item: itens ) {
            total += item.quantidade * item.preco;
        }

        return total;
    }
}

