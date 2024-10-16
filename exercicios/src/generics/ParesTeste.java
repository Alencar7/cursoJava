package generics;

public class ParesTeste {

    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1,"Adriano");
        resultadoConcurso.adicionar(2,"Arlinda");
        resultadoConcurso.adicionar(3,"Armandro");
        resultadoConcurso.adicionar(4,"Armario");
        //metodo getValor()
        resultadoConcurso.adicionar(2,"Rebeca");

        System.out.println(resultadoConcurso.getValor(2));
    }
}
