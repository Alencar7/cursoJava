package arrays;

public class Foreach {

    public static void main(String[] args) {

        double[] notas = { 9.9, 7.8, 4.5, 6.9 };
        //for normal
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

        System.out.println();

        // foreach  -> BEM MAIS SIMPLES
        for(double nota: notas ){
            System.out.print(nota + " ");

        }
    }
}
