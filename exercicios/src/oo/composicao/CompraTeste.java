package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Joao Pedro";

        // compra1.itens.add(new Item("Caneta", 20, 7.45)); //metodo stradiconal 1x1
        compra1.adicionarItem("Caneta", 20, 7.45); // apenas um exemplo
        compra1.adicionarItem("Borracha", 12, 4.5); // void adcionarItem
        compra1.adicionarItem("Caderno", 3, 21.40);

        System.out.println(compra1.itens.size()); //quantidade de itens no compra1.itens
        System.out.println(compra1.obterValorTotal());

        //SO PRA MOSTRAR A RELACAO BIDIRECIONAL
        double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println("O valor total e R$" + total);
    }

}
