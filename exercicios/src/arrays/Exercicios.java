package arrays;

import java.util.Arrays;

public class Exercicios {

    public static void main(String[] args) {
        //ARRAY INICIALIZADO
        double[] notasAlunoA = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));//importar uma bibltc- Arrays

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        String x = Arrays.toString(notasAlunoA);
        System.out.println(x);

        double mediaTotalAlunoA = 0;
        for(int i = 0; i < notasAlunoA.length; i++) {
            //.length = quantidade de espacos no array instanciado
            mediaTotalAlunoA += notasAlunoA[i];
        }
        System.out.println(mediaTotalAlunoA / notasAlunoA.length);
        System.out.println(notasAlunoA[0]); // primeira casa
        System.out.println(notasAlunoA[notasAlunoA.length - 1]); //ultima casa


        //ARRAY INICIALIZADO DE OUTRA FORMA
        final double notaArmazenada = 5.9;
        double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
        double mediaTotalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            mediaTotalAlunoB += notasAlunoB[i];
        }
        System.out.println(mediaTotalAlunoB / notasAlunoB.length);

    }
}
