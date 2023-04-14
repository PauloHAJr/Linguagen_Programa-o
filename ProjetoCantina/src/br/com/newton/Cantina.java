package br.com.newton;

import javax.swing.*;

public class Cantina {
    public static void main(String[] args) {

        Pedido p = new Pedido();
        Cliente c = new Cliente();
        Massa m = new Massa();

        String nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        c.nome=nome;
        p.c=c;

        String tipomassa=JOptionPane.showInputDialog("Informe o nome da massa: ");
        m.tipo=tipomassa;
        double valorMassa=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa: "));
        m.valor=valorMassa;
        p.m=m;

        Ingrediente i = new Ingrediente();

        int opcao = 0;
        while (opcao != 5) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe os ingredientes escolhidos:\n1-Bacon\n2-Mussarela\n3-Tomate\n4-Queijo\n5-Sair"));
            switch (opcao) {
                case 1:
                    i.nome= "Bacon";
                    p.ListaIngrediente.add(i);
                    break;
                case 2:
                    i.nome="Mussarela";
                    p.ListaIngrediente.add(i);
                    break;
                case 3:
                    i.nome="Tomate";
                    p.ListaIngrediente.add(i);
                    break;
                case 4:
                    i.nome="Queijo";
                    p.ListaIngrediente.add(i);
                    break;
                default:
                    break;
            }
        }

        }
    }

////////tentativa anterior
/*        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Realizar pedido:" + "\n1.Continuar" +"\n2.Sair"));
        if (resposta == 1) {

            p1.setCliente(JOptionPane.showInputDialog("Digite o nome do Cliente: "));

            p1.setCliente(JOptionPane.showInputDialog("Digite o nome do Cliente: "));

            p1.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Pizza: ")));

            int borda = Integer.parseInt(JOptionPane.showInputDialog("A Pizza possui borda: " + "\n1.Sim" + "\n2.Não"));
            boolean sim;
            if (borda == 1)
                sim = true;
            else
                sim = false;

            JOptionPane.showMessageDialog(null, "Seu pedido " + "\nNome: " + p1.getNome() + "\nValor: " + z.format(p1.CalcularValor(sim)) + "\nFoi finalizado com sucesso!");
        }*/