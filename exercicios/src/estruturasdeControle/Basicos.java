package estruturasdeControle;

import java.util.Scanner;

public class Basicos {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        
        System.out.println("(utilize a virgula) \n" +
                "Informe a media:");
        double media = ent.nextDouble();
        
        if (media >= 7.0){
            System.out.println("Aprovado!");
            System.out.println("Parabens!");
        } else if (media < 7 && media >= 4.5) {
            System.out.println("Em recuperacao.");
        } else
            System.out.println("Reprovado!");
        
        ent.close();
    }
}
