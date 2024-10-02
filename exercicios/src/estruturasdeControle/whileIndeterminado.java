package estruturasdeControle;

import java.util.Scanner;

public class whileIndeterminado {
/**
 *          WHILE COM LIMITE DE REPETICAO
 * */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while(!valor.equalsIgnoreCase("parar")){
            System.out.print("Voce diz: ");
            valor = entrada.nextLine();
        }
        entrada.close();
    }
}
