package fundamentos;

import java.util.Scanner;

public class console {

    public static void main(String[] args) {
        //LEMBRAR DE ABRIR E FECCHAR A 'ENTRADA'
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos. %n",
                nome, sobrenome, idade);
        entrada.close();
    }
}
