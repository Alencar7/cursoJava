package oo.heranca;

public class Heroi extends Jogador {

    public Heroi(int x, int y){
        super(x, y); // super = herenca da classe pai(jogador)
    }

    @Override //deiar claro que ta sobre escrevendo
   public boolean atacar(Jogador oponente){
       boolean ataque1 = super.atacar(oponente); // chamou o metodo 'pai' pelo super.atacar()
       boolean ataque2 = super.atacar(oponente);
       boolean ataque3 = super.atacar(oponente);
       return ataque1 || ataque2 || ataque3 ; // se retornar falso o heroi nao atacou

   }
}
