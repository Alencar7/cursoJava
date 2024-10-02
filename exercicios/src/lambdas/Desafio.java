package lambdas;

/* passos:
    1. A partir do produto, calcular o preco real(com desconto.
    2. IMposto municipal : >= 2500 (8,5%) / < 2500 (insento)
    3. Frete : >= 3000( custa 100) // < 3000 (custa 50)
    4. Arredondar: Deixar duas casas decimais
    5. Formatar: R$1234.56 (colocar R$ e a virgula)
     */

import java.util.function.*;

public class Desafio {

    public static void main(String[] args) {

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        //UnaryOperator<Double> arredondar =
        //        preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatacao =
                preco -> ("R$" + preco).replace(".", ",");


        Produto p = new Produto("iPad", 8908.54, 0.13);

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                //.andThen(arredondar) -> minha maquina nao quer rodar isso :-(
                .andThen(formatacao)
                .apply(p);

        System.out.println( "O preco final e "+ preco);

    }
}
