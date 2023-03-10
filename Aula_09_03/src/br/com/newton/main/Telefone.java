package br.com.newton.main;

import br.com.newton.agenda.Contato;

import javax.swing.*;
import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {
        Contato novoContato = new Contato();
        String nome;
        String numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.next();
        novoContato.setNome(nome);

        System.out.println("Digite o número: ");
        numero = sc.next();
        novoContato.setNumero(numero);

        if(novoContato.getNumero().length()!=9)
            System.out.println("Núemro invalido");
        else
            System.out.println("Número registrado");

        novoContato.Excluir(novoContato);
    }
}