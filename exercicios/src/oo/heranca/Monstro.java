package oo.heranca;

public class Monstro extends Jogador{

    public Monstro(){
        this(0, 0); // this = mesma classse
    }

    public Monstro(int x, int y){
        super(x, y); // super = heranca, classe pai
    }
}
