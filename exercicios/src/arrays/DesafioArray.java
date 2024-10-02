package arrays;

import java.util.Scanner;

public class DesafioArray {
    //quantidade de notas totais
    // 1 laco for - armazenar as notas no arrey
    // 2 laco foreach - somar as notas e tirar a media

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantas notas seram apresentadas: ");
        int tamanhoArray = entrada.nextInt();

        double[] nota = new double[tamanhoArray];

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            nota[i] = entrada.nextDouble();
        }

        double notaTotal = 0;
        for (double notas : nota) {
            notaTotal += notas;
        }
        double media = notaTotal / nota.length;
        System.out.printf("A media de suas notas: %.2f. ", media);
        System.out.println(" ");
        if (media >= 7.00) {
            System.out.println("Parabens! Voce passou!");
        } else if (media <= 3.99) {
            System.out.println("Voce reprovou.");
        } else {
            System.out.println("Voce esta em recuperacao!");
        }
        entrada.close();
    }
}
