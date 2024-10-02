package estruturasdeControle;

import java.util.Scanner;

public class Desafio {
    //desafio para dias da semana
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String dia = ent.next();
//      usar o .equalsIgnoreCase(dia)
        if (dia.equalsIgnoreCase("Domingo")){
            System.out.println("<> 1");
        } else if ("Segunda".equalsIgnoreCase(dia)) {
            System.out.println("<> 2");
        } else if ("Terca".equalsIgnoreCase(dia)) {
            System.out.println("<> 3");
        }else if ("Quarta".equalsIgnoreCase(dia)) {
            System.out.println("<> 4");
        }else if ("Quinta".equalsIgnoreCase(dia)) {
            System.out.println("<> 5");
        }else if ("Sexta".equalsIgnoreCase(dia)) {
            System.out.println("<> 6");
        }else if ("Sabado".equalsIgnoreCase(dia)) {
            System.out.println("<> 7");
        }else
            System.out.println("Resposta invalida.\n" +
                    "Tente novamente.");

        ent.close();

    }
}
