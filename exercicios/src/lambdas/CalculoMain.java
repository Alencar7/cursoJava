package lambdas;

public class CalculoMain {

    public static void main(String[] args) {

        Calculo calculo = new Soma();
        System.out.println(calculo.executar(7, 7));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(4,7));

    }
}
