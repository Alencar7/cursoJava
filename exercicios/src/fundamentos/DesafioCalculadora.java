package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe um numero: ");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operacao: ");
        String op = entrada.next();

//      usando os operadores ternarios
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
//      .equals() = comparacao de string

        System.out.printf("%.2f %s %.2f = %.2f"
                , num1, op, num2, resultado);
        entrada.close();
    }
}
