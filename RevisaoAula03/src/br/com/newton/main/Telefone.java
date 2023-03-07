package br.com.newton.main;

import br.com.newton.agenda.Contato;

import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {
        Contato novoContato = new Contato();
        String nome;
        String numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.next();

        System.out.println("Digite o número: ");
        numero = sc.next();

        if(numero.length()<9)
            System.out.println("Núemro invalido");
        else
            System.out.println("Número registrado");
        }
    }

