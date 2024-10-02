package estruturasdeControle;

public class EstDeRepeticao {

    public static void main(String[] args) {

        System.out.println("While");
        int variavel = 1;
        int x = 1;

        while (variavel <= 10) {
            System.out.println(x);
            variavel++;
            x++;
        }
        // For ( a ; b ; c )
        System.out.println("For - exemplo 1");
        for (int contador = 1; contador <=10; contador++) {
            System.out.printf("i= %d", contador);
        }

/**
 * for sem comandos especificos
        System.out.println("For - exemplo 2");
        int y = 2;
        for ( ; y < 10; ){
            System.out.println("y= "+ y);
            y++;
        } */
//LACO INFINITO COM FOR
//        for (;true;){
//            System.out.println("fim"); }

    }
}
