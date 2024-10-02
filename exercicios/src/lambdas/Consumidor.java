package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor     {
    public static void main(String[] args) {

        Consumer<Produto> imprimir = // recebe um unico parametro e nao retorna nada!
                p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Caneta", 12.32,0.09);
        imprimir.accept(p1); // accept= passa Produto e, com isso, pode imprimir

        Produto p2 = new Produto("Notebook", 2987.90, 0.25 );
        Produto p3 = new Produto("Caderno", 29.90, 0.2 );
        Produto p4 = new Produto("Borracha", 2.90, 0.2 );
        Produto p5 = new Produto("Lapis", 7.90, 0.2 );


        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println); //chamando o toSTRING
    }
}
