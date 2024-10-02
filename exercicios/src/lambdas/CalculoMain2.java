package lambdas;

public class CalculoMain2 {

    public static void main(String[] args) {

        //FUNCAO calc ASSOSSIADA A AO SOMA
        Calculo calc = (x, y) -> { return x + y; };
        //interface com um unico metodo + lambda
        System.out.println(calc.executar(4,7));

        calc  = (x, y) -> x * y;
        System.out.println(calc.executar(2,3));

        System.out.println(calc.legal()); //default
        System.out.println(Calculo.muitoLegal()); //static


    }
}
