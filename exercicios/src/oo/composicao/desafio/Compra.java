package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> items = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade){
        this.items.add(new Item(p, quantidade)); //CRIACAO DO ITEM
    }

    void adicionarItem(String nomeProduto, double precoProduto, int quantidadeItem){//unidirecional
        //ADICAO DO ITEM ( criacao do produto)
        //var produto = new Produto(nome, preco);
        //this.items.add(new Item(produto, quantidade));
        this.items.add(new Item(new Produto(nomeProduto, precoProduto), quantidadeItem));
    }

    double obterValorTotal() {
        double total = 0;

        for(Item item: items){
            total += item.quantidadeItem * item.produtoItem.precoProduto; //quantidade.Item
        }

        return total;
    }


}
