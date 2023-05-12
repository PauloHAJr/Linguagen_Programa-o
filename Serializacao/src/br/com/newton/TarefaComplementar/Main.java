package br.com.newton.TarefaComplementar;

import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{

        String path = "C:/Users/12116312/Documents/NumerosBanco.txt";
        Cliente c1 = new Cliente();
        Banco b1 = new Banco();

        c1.setNome(JOptionPane.showInputDialog("Digite o nome do cliente:"));
        b1.setNome(JOptionPane.showInputDialog("Digite o nome do banco:"));
        b1.somaSaldo(path);



    }
}
