package estruturasdeControle;

import java.util.Scanner;

public class desafioWhile {

    public static void main(String[] args) {
        // calcular a media das notas
        // 1 variavel para as notas e outra para a quantidade de notas
        // ex: 30 nota total & 3 quantidades de provas

        double total = 0;
        int quantidade = 0;
        double nota = 0;

        Scanner entrada = new Scanner(System.in);

        while (nota != -1){
            System.out.println("Sistema de notas. " +
                    "Para sair digite: -1");
            System.out.print("Digite a nota:");
            nota = entrada.nextDouble();
            if (nota <= 10 && nota >= 0){
                total += nota;
                quantidade += 1;
                System.out.println(total);
                System.out.println(quantidade);
            } else if (nota != -1) {
                System.out.println("Nota invalida! ");
            }
        }

        double media = total / quantidade;
        System.out.println("Media = " + media);

        entrada.close();
    }
}
