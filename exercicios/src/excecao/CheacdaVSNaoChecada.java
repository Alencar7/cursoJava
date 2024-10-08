package excecao;

public class CheacdaVSNaoChecada {

    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());;
        }

        System.out.println("Fim :) ");
    }

    //EXCECAO NAO-CHECADA OU NAO-VERIFICADA - NAO PRECISA TRATAR O ERRO NA HORA
    static void geraErro1() throws RuntimeException {
        throw   new RuntimeException("Ocorreu um erro bem legal #01!");
        // THROW = LANCE UM NOVO ERRO, SEM O THROW NAO FUNCIONA
    }

    //EXCECAO CHECADA OU VERIFICADA - PRECISA TRATAR O ERRO OU DECLARAR O 'throws Exception'
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro bem legal #02!");
        // THROW = LANCE UM NOVO ERRO, SEM O THROW NAO FUNCIONA
    }

}
