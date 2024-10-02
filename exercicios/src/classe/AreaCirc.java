package classe;

public class AreaCirc {

    double raio;
    final static double PI = 3.1415; // PI virou uma constante

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    double area(){
        return PI * Math.pow(raio, 2); //math.pow e um exemplo de static
    }

    static double area(double raio){ //metodo statico
        return PI * Math.pow(raio, 2 );
    }

}
