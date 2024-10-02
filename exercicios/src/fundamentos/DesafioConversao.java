package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        //abrir a entrada
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro salario: ");
        String valor1 = entrada.next().replace(",", "."); //substituir a ',' pelo '.'

        System.out.println("Informe o segundo salario: ");
        String valor2 = entrada.next().replace(",", ".");

        System.out.println("Informe o terceiro salario: ");
        String valor3 = entrada.next().replace(",", ".");

        //passando um str -> inteiro ou double
        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = ((salario1 + salario2 + salario3)/3);
        System.out.println("A media dos salarios e: " + media);

        //fechar a entrada
        entrada.close();
    }
}
