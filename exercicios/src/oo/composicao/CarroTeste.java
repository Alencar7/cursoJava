package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro(); //c1 obj instanciado
        System.out.println(c1.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());

        //acessar o att motor/motor tb e obj/ eu posso acessar o obj=giros
        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear(); //nao funciona, por causa do limite
        c1.frear(); //nao funciona, por causa do limite
        c1.frear(); //nao funciona, por causa do limite
        System.out.println(c1.motor.giros());

        // AQUI FALTOU O ENCAPSULAMENTO
        // c1.motor.fatorInjecao = - 30


    }
}
