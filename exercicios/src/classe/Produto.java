package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    //Construtor padrao
    Produto() {
    //
    }

    //construtor explicito
    // agora consigfo instanciar um obj passando um nome
    Produto(String nomeInicial,
            double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    //sem desconto do gerente
    double precoComDesconto(){
        return preco * (1 - desconto);
    }
    //com desconto do gerente
    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
