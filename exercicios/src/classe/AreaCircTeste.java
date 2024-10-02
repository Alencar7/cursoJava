package classe;

public class AreaCircTeste {

    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10);
        a1.raio = 10;
        //a1.pi = 100000;

        // MUDANDO O VALOR DE STATIC PI >>>> AreaCirc.pi = 3.1415;

        System.out.println(a1.area()); //metodo que pertence a instancia

        System.out.println(AreaCirc.area(100)); //metodo que pertence a classe
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);

    }
}
