package PizzaHamburguer;

import javax.swing.*;
import java.text.NumberFormat;

public class Restaurante {
    public static void main(String[] args) {

        NumberFormat z = NumberFormat.getCurrencyInstance();

        Pizza p1 = new Pizza();
        Hamburguer h1 = new Hamburguer();

        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Informe o pedido" + "\n1.Pizza" + "\n2.Hamburguer" + "\n3.Sair"));

        if(resposta==1){

            p1.setNome(JOptionPane.showInputDialog("Digite o nome da Pizza desejada: "));

            p1.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Pizza: ")));

           int borda = Integer.parseInt(JOptionPane.showInputDialog("A Pizza possui borda: "+"\n1.Sim"+"\n2.Não"));
            boolean sim;
                if (borda == 1)
                    sim = true;
                else
                    sim = false;

           JOptionPane.showMessageDialog(null,"Seu pedido "+"\nNome: "+p1.getNome()+"\nValor: "+z.format(p1.CalcularValor(sim))+"\nFoi finalizado com sucesso!");

        } else if (resposta==2) {

            h1.setNome(JOptionPane.showInputDialog("Digite o nome do Hamburguer desejado: "));

            h1.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Hamburguer: ")));

            int borda = Integer.parseInt(JOptionPane.showInputDialog("O Hamburguer é artesanal: "+"\n1.Sim"+"\n2.Não"));
            boolean sim;
            if (borda == 1)
                sim = true;
            else
                sim = false;

            JOptionPane.showMessageDialog(null,"Seu pedido "+"\nNome: "+h1.getNome()+"\nValor: "+z.format(h1.CalcularValor(sim))+"\nFoi finalizado com sucesso!");

        }else{
            JOptionPane.showMessageDialog(null,"Pedido Indefirido");
        }

    }
}
