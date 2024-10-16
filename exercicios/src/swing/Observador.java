package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {

    public static void main(String[] args) {
        //instanciando uma janela
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200); //tam da janela
        janela.setLayout(new FlowLayout()); //servir para ver o botao melhor
        janela.setLocationRelativeTo(null);//centralizar janela na tela do pc


        JButton botao = new JButton("Clicar");
        janela.add(botao);

        botao.addActionListener(new ActionListener() {
            //instanciando uma class anonima :)
            public void actionPerformed(ActionEvent e) { // [clicar] ativo retorna
                System.out.println("Evento ocorreu. "); //isso
            }
        } );

        janela.setVisible(true);

    }
}
