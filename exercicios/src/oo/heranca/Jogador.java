package oo.heranca;

public class Jogador {

    public int x;
    public int y;
    public int vida = 100;

   // Jogador(){
   //     this(0 ,0); //chamando o construtor da propria classe
   // }

    protected Jogador(int x, int y){//construtor com o mesmo nome da classe
        this.x = x;
        this.y = y;
    }

    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY ==1){
            oponente.vida -= 10;
            return true;
        } else if (deltaX ==1 && deltaY ==0) {
            oponente.vida -= 10;
            return true;
        } else {
            return true;
        }
    }

    public boolean andar(Direcao direcao) {
        switch(direcao){
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }
        if(direcao == Direcao.NORTE){
            y++;
        }
        return true;
    }
}
