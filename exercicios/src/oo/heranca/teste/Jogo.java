package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;
import oo.heranca.Jogador;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro(); // heroi herdou a class jogador
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11); //monstro herdou - jogador

        System.out.println("Monstro tem =>" + monstro.vida);
        System.out.println("Monstro tem=> " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem =>" + monstro.vida);
        System.out.println("Monstro tem=> " + heroi.vida);

        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.LESTE);
        monstro.andar(Direcao.SUL);
        monstro.andar(Direcao.OESTE);

        // System.out.println(monstro.x);
        // System.out.println(monstro.y);


    }
}
