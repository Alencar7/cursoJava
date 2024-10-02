package lambdas;

import java.util.function.BinaryOperator;

public class CalculoMain3 {
        //JAVA.UTIL.FUNCION
    public static void main(String[] args) {

        //JAVA NAO PERMITE=> int -> Double(tipo classe)
        //Double
        BinaryOperator<Double> calc = (x, y) -> { return x + y; };
        System.out.println(calc.apply(4.0,7.0));

        calc  = (x, y) -> x * y;
        System.out.println(calc.apply(2.0,3.0));

        //Integer
        BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
        System.out.println(calc.apply(4.0,7.0));

        calc  = (x, y) -> x * y;
        System.out.println(calc.apply(2.0,3.0));


    }
}
