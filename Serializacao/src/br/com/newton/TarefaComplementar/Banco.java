package br.com.newton.TarefaComplementar;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;


public class Banco {
    private String nome;
    ArrayList<String>listaContas = new ArrayList();

    public Banco() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getListaContas() {
        return listaContas;
    }

    public void setListaContas(ArrayList<String> listaContas) {
        this.listaContas = listaContas;
    }

    public void somaSaldo(String path)throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        String linha;
        //System.out.println("Lista de contas");
        while ((line = reader.readLine()) != null) {
            //System.out.println(line);
            linha = line;
            linha.split(",");
            listaContas.add(linha);
            JOptionPane.showMessageDialog(null,linha);
            }
            reader.close();

            /*String linha = line;
            linha.split(",");
            listaContas.add(linha);
            JOptionPane.showMessageDialog(null,linha);

        /*String numeros = "05abc474 - 651ssss1120;lks01=9";
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(numeros);

        StringBuilder nroExtraidos = new StringBuilder();
        while (m.find()) {
            nroExtraidos.append(m.group().trim() + "/");
        }
        System.out.println(nroExtraidos);
        */

        }
    }

