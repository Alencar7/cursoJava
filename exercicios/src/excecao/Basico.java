package excecao;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;
        // ctrl + alt + t
        try{
            imprimirNomeDoAluno(a1);
        } catch (Exception excecao){
            System.out.println("Ocorreu um erro " +
                    "no momento de imprimir o nome do usuario!");
        }

        // ctrl + alt + t
        try {
            System.out.println( 7 / 0 );
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
            //e.printStackTrace(); //VAI IMPRIMIR A PILHA DE EXECUCAO
        }
        // Exception in thread "main" java.lang : / by zero

        System.out.println("fim:) ");

    }

    public static void imprimirNomeDoAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
