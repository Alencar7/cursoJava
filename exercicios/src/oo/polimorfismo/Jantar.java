package oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Arroz porcaoArroz = new Arroz(0.2);
        Feijao porcaoFeijao = new Feijao(0.1);

        Comida porcaoComida = new Arroz(0.3); //classe abstrata NAO PODE INSTANCIAR(Arroz)

        System.out.println(convidado.getPeso());

        convidado.comer(porcaoArroz);
        convidado.comer(porcaoFeijao);
        convidado.comer(porcaoComida);
        System.out.println(convidado.getPeso());

        Sorvete porcaoSobremesa = new Sorvete(0.4);

        convidado.comer(porcaoSobremesa);
        System.out.println(convidado.getPeso());

    }
}
