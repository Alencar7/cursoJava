package oo.heranca.desafio;

public class Carro {
    //velocidade nunca pode ser diff de 0
    //metodo acelerar
    //metodo freiar

    public final int VELICODADE_MAXIMA;
    protected int velocidade; //passado por gherenca
    private int delta = 5;

    protected Carro(int velicodadeMaxima) { //CONSTRUTOR
        VELICODADE_MAXIMA = velicodadeMaxima;
    }

    public void acelerar(){ //metodo
        if(velocidade + getDelta() > VELICODADE_MAXIMA){
            velocidade = VELICODADE_MAXIMA;
        }else {
            velocidade += getDelta();
        }
    }

    public void frear(){
        if(velocidade >= 5){
            velocidade -= 3;
        }else {
            velocidade = 0;
        }
    }

    public String toString(){ //retorno </> texto + velocidade </> converte tudo p/ str
        return " A velocidade e " + velocidade + "Km/h.";
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
