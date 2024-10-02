package oo.encapsulamento;

public class PessoaMain {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pedro", "Silva", 35);
        p1.setIdade(23); //ALTERAR A IDADE

        System.out.println(p1.getIdade()); //LER
        System.out.println(p1); // toString
        System.out.println(p1.getNomeCompleto());
    }


}
