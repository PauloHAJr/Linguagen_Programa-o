package PizzaHamburguer;

import javax.swing.*;
import java.text.NumberFormat;

public class Restaurante {
    public static void main(String[] args) {

        NumberFormat z = NumberFormat.getCurrencyInstance();

        Pizza p1 = new Pizza();
        Hamburguer h1 = new Hamburguer();

        String resposta = JOptionPane.showInputDialog("Informe o pedido" + "\n1.Pizza" + "\n2.Hamburguer" + "\n3.Sair");
        int rp = Integer.parseInt(resposta);
        if(rp==1){

           String nome = JOptionPane.showInputDialog("Digite o nome da Pizza desejada: ");
            p1.setNome(nome);

           String valor = JOptionPane.showInputDialog("Digite o valor da Pizza: ");
            Double valorP = Double.parseDouble(valor);
            p1.setValor(valorP);

           String possuiBorda = JOptionPane.showInputDialog("A Pizza possui borda: "+"\n1.Sim"+"\n2.Não");
           boolean sim;
           int borda = Integer.parseInt(possuiBorda);

                if (borda == 1)
                    sim = true;
                else
                    sim = false;
           JOptionPane.showMessageDialog(null,"Seu pedido "+"\nNome: "+p1.getNome()+"\nValor: "+z.format(p1.CalcularValor(sim))+"\nFoi finalizado com sucesso!");
         } else if (rp==2) {
            String nome = JOptionPane.showInputDialog("Digite o nome do Hamburguer desejado: ");
            h1.setNome(nome);

            String valor = JOptionPane.showInputDialog("Digite o valor do Hamburguer: ");
            Double valorP = Double.parseDouble(valor);
            h1.setValor(valorP);

            String possuiBorda = JOptionPane.showInputDialog("O Hamburguer é artesanal: "+"\n1.Sim"+"\n2.Não");
            boolean sim;
            int borda = Integer.parseInt(possuiBorda);

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
