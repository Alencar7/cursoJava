package estruturasdeControle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        // if(...) sentenca; ou {}
        // while(...) sentenca; ou {}
        // for ( ...; ...; ...) sentenca; ou {}
        // do{} while(...); -> o 'do' faz o codigo executar 1 vez ao menos

        Scanner entrada = new Scanner(System.in);

        String texto = "";
        do {
            System.out.println("Fale as palavras magicas. ");
            System.out.println("Quer sair?");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        entrada.close();
    }
}
