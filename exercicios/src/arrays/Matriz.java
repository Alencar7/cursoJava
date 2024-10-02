package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos?");
        int quantidadeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno?");
        int quantidadeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];
        double total = 0;
        externoAluno:for (int a = 0; a < notasDaTurma.length; a++) {
            System.out.println("---------------------------------");
            internoNotas:for (int c = 0; c < notasDaTurma[a].length; c++) {
                System.out.printf("Informe a nota %d do aluno %d: ", (c+1), (a+1) );
                notasDaTurma[a][c] = entrada.nextDouble();
                total += notasDaTurma[a][c];
            }
        }

        System.out.println("---------------------------------");
        double media = total/(quantidadeAlunos*quantidadeNotas);
        System.out.printf("Meida da turma: %.2f", media);

        //CRIANDO UMA MATRIZ COM AS NOTAS DOS ALUNOS
        for(double[] notasDosAlunos : notasDaTurma){ // pegando o 1Arrey do banco de notas
            System.out.println(Arrays.toString(notasDosAlunos)); //println para formar a matriz
        }

        entrada.close();
    }
}
