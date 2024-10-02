package oo.heranca.desafio;

public class Hb20 extends Carro implements Esportivo, Luxo{
    //acelerar de carro TEM que ser x3 mais rapido

    private boolean ligarTurbo = false;
    private boolean ligarAr= false;

    public Hb20(){
        this(315);
    }

    public Hb20(int velocidadeMaxima){ //classe pai importada
        super(velocidadeMaxima);
        setDelta(15); //private
    }

    @Override
    public void ligarTurbo(){ // VEM DA INTERFACE ESPORTIVA
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo(){
        ligarTurbo = false;
    }

    @Override
    public void ligarAr(){ // VEM DA INTERFACE LUXO
        ligarAr = true;
    }

    @Override
    public void desligarAr(){
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if( ligarTurbo && ! ligarAr ){
            return 35;
        } else if ( ligarTurbo && ligarAr ) {
            return 30;
        }else if ( ! ligarTurbo && ! ligarAr) {
            return 20;
        }else {
            return 15;
        }

    }

    //    @Override //EFEITO DE VALIDACAO, USADO PARA SUBSTITUIR DO MET. PAI
//    public void acelerar() {
//        super.acelerar();

//   public String toString(){
//       return "";
//   }
}

