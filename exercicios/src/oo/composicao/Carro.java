package oo.composicao;

public class Carro { //A CLASSE E A DONA DO ATT, SE FOR MUDAR O ATT VAI NA CLASSE

    Motor motor = new Motor(); //att de instancia(flexivel)

    //criacao de metodo
    void acelerar(){
        if(motor.fatorInjecao < 2.6){
            motor.fatorInjecao += 0.4;
        }
    }

    void frear(){
        if(motor.fatorInjecao > 0.5){
            motor.fatorInjecao -= 0.2;
        }
    }

    void ligar(){
        motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado ;
    }
}
