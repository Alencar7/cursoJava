package fundamentos;

import javax.swing.*;

public class ConversaoStrparaNum {

    public static void main(String[] args) {
        /**
         * */
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro numero"); //recebe str
        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo numero"); //recebe str

        System.out.print(valor1 + valor2); //resposta em str
        // CONVERTENDO PARA NUMERO
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        //
        double soma = numero1 + numero2;
        System.out.println("A soma e" + soma);
        System.out.println("A media e" + soma / 2);
        //                  BigDecimal
        // -> e uma biblioteca que traz mais precisao em alguns casos!



    }
}
