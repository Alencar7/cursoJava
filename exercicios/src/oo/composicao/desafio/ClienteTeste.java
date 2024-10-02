package oo.composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 5.5, 5);
        compra1.adicionarItem(new Produto("Notebook", 4000.5),2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Lapis", 3.5, 1);
        compra2.adicionarItem(new Produto("Notebook", 8000.5),1);

        Cliente clienteA = new Cliente("Maria Julia");
        clienteA.compras.add(compra1); //sem void adicionarCompra

        Cliente clienteB = new Cliente("Julia Maria");
        clienteB.adicionarCompra(compra2); //com void adicionarCompra

        System.out.println(clienteA.obterValor());
        System.out.println(clienteB.obterValor());

    }

}
