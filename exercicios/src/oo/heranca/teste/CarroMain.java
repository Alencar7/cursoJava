package oo.heranca.teste;

import oo.heranca.desafio.FiatUno;
import oo.heranca.desafio.Hb20;

public class CarroMain {
    public static void main(String[] args) {

        //Carro c1 = new FiatUno(); -> tipo generico
        FiatUno c1 = new FiatUno(); // c1 - variavel </> FiatUno - objeto

        //c1.acelerar(); -> tipo generico
        c1.acelerar();
        System.out.println(c1);
        c1.frear();
        System.out.println(c1);

        Hb20 c2 = new Hb20(310);
        c2.ligarTurbo();
        //c2.ligarAr();

        System.out.println(c2.velocidadeDoAr());

        c2.acelerar();
        System.out.println(c2);
        c2.frear();
        System.out.println(c2);
    }

}
