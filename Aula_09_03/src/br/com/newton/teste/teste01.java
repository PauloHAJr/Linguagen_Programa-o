package br.com.newton.teste;

import javax.swing.*;

public class teste01 {
    public static void main(String[] args) throws NumberFormatException {

        int valorA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A: "));
        int valorB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B: "));

        int resultado = valorA * valorB;

        JOptionPane.showMessageDialog(null, "Resultado final: "+resultado);

    }
}
