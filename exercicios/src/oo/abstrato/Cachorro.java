package oo.abstrato;

public class Cachorro extends Mamifero{
    //CACHORRO E UMA CLASSE CONCRETA
    @Override
    public String mamar(){
        return "Usando leite";
    }

    @Override
     public String mover() { // => DEFINIDO NA CLASSE MAMIFERO
         return "Usando as patas";
     }


}
