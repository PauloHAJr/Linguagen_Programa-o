package br.com.newton.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploBotao implements ActionListener {

    private JButton botao;

    public void janela(){
        JFrame frame = new JFrame();
        botao = new JButton();
        botao.setText("Clique aqui");
        botao.setFont(new Font("Arial",Font.BOLD, 12));

        //REGISTRA EVENTO
        botao.addActionListener(this);

        frame.getContentPane().add(botao);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        botao.setText("Botão foi clicado");

        //ALTERA FONTE
        botao.setFont(new Font("SansSerif",Font.BOLD, 20));
    }

    public static void main(String[] args) {
        ExemploBotao exb = new ExemploBotao();
        exb.janela();
    }
}

