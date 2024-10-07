package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
    // criar um filtro para saber quais prodfutos SAO RELEVANTES
    public static void main(String[] args) {

        Produto p1 = new Produto("Caneta", 2.99, 0.10, 2);
        Produto p2 = new Produto("Lapis", 1.99, 0.10, 0);
        Produto p3 = new Produto("Caderno", 10.99, 0.15, 4);
        Produto p4 = new Produto("Pasta", 8.99, 0.18, 2);
        Produto p5 = new Produto("Estojo", 9.99, 0.20, 0);
        Produto p6 = new Produto("Borracha", 3.99, 0.35, 0);

        List<Produto> produtos =
                Arrays.asList(p1, p2, p3, p4, p5, p6);

        //filter
        Predicate<Produto> superPromocao = p -> p.desconto >= 0.10;
        //filter
        Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
        // map
        Function<Produto, String> produtoRelevante =
                p -> ">>>Frete Gratis e Desconto!\nProduto relevante: " + p.nome + ".";

        produtos.stream()
                .filter(superPromocao)
                .filter(freteGratis)
                .map(produtoRelevante)
                .forEach(System.out::println);

        System.out.println("___________________________________________");
        // Juntando superPromocao + freteGratis
        Predicate<Produto> melhoresPrecos = p -> p.desconto >= 0.10 && p.valorFrete == 0;
        produtos.stream().filter(melhoresPrecos).map(produtoRelevante).forEach(System.out::println);
    }
}
