package br.com.newton.main;

import br.com.newton.agenda.Contato;

import javax.swing.*;

public class Telefone {
    public static void main(String[] args) {
        Contato novoContato = new Contato();


        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        novoContato.setNome(nome);

        String numero = JOptionPane.showInputDialog("Digite seu número: ");
        novoContato.setNumero(numero);

        JOptionPane.showMessageDialog(null,"Contato adicionado!"+" Seu nome: "+nome+" e seu número: "+numero);

        /*if(novoContato.getNumero().length()!=9)
            System.out.println("Núemro invalido");
        else
            System.out.println("Número registrado");

        novoContato.Excluir(novoContato);*/
    }
}