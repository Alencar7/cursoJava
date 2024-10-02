package oo.polimorfismo;

public abstract class Comida { //CRIANDO UMA SUPER CLASSE
    private double peso;

    public Comida(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
