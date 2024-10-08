package excecao;

public class Causa {
    // hierarquia de causas de ERRO
    public static void main(String[] args) {

        //TRATANDO O ERRO
        try {
            metodoA(null);
        } catch (IllegalArgumentException e) {
           if (e.getCause() != null){
               System.out.println(e.getCause().getMessage());
           }
        }
        //SEM TRATAR O ERRO
        metodoA(null);
    }

    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw new IllegalArgumentException(causa);
        }
    }

    static void metodoB(Aluno aluno) {
        if(aluno == null){
            throw new NullPointerException("Aluno esta NULO0O0O");
        }
        System.out.println(aluno.nome);
    }
}
