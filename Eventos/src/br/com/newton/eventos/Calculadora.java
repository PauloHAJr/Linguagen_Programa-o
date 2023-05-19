package br.com.newton.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculadora implements ActionListener{

    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton bt0 = new JButton("0");
    JButton bt1 = new JButton("1");
    JButton bt2 = new JButton("2");
    JButton bt3 = new JButton("3");
    JButton bt4 = new JButton("4");
    JButton bt5 = new JButton("5");
    JButton bt6 = new JButton("6");
    JButton bt7 = new JButton("7");
    JButton bt8 = new JButton("8");
    JButton bt9 = new JButton("9");
    JButton btPonto = new JButton(".");
    JButton btClear = new JButton("C");
    JButton btDelete = new JButton("Del");
    JButton btEqual = new JButton("=");
    JButton btMul = new JButton("x");
    JButton btDiv = new JButton("/");
    JButton btPlus = new JButton("+");
    JButton btMinun = new JButton("-");


    public void janela(){
        preparaJanela();
        addComponentes();


    }
    public void preparaJanela(){
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponentes(){
        label.setBounds(250,0,50,50);
        label.setForeground(Color.LIGHT_GRAY);
        frame.add(label);

        textField.setBounds(10,90,270,40);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10,140,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        onRadioButton.setBackground(Color.LIGHT_GRAY);
        onRadioButton.setForeground(Color.WHITE);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10,170,60,40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        offRadioButton.setBackground(Color.LIGHT_GRAY);
        offRadioButton.setForeground(Color.WHITE);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        bt7.setBounds(10,230,60,40);
        bt7.setFont(new Font("Arial", Font.BOLD,20));
        bt7.setFocusable(false);
        frame.add(bt7);

        bt8.setBounds(80,230,60,40);
        bt8.setFont(new Font("Arial", Font.BOLD,20));
        bt8.setFocusable(false);
        frame.add(bt8);

        bt9.setBounds(150,230,60,40);
        bt9.setFont(new Font("Arial", Font.BOLD,20));
        bt9.setFocusable(false);
        frame.add(bt9);

        bt4.setBounds(10,290,60,40);
        bt4.setFont(new Font("Arial", Font.BOLD,20));
        bt4.setFocusable(false);
        frame.add(bt4);

        bt5.setBounds(80,290,60,40);
        bt5.setFont(new Font("Arial", Font.BOLD,20));
        bt5.setFocusable(false);
        frame.add(bt5);

        bt6.setBounds(150,290,60,40);
        bt6.setFont(new Font("Arial", Font.BOLD,20));
        bt6.setFocusable(false);
        frame.add(bt6);

        bt1.setBounds(10,350,60,40);
        bt1.setFont(new Font("Arial", Font.BOLD,20));
        bt1.setFocusable(false);
        frame.add(bt1);

        bt2.setBounds(80,350,60,40);
        bt2.setFont(new Font("Arial", Font.BOLD,20));
        bt2.setFocusable(false);
        frame.add(bt2);

        bt3.setBounds(150,350,60,40);
        bt3.setFont(new Font("Arial", Font.BOLD,20));
        bt3.setFocusable(false);
        frame.add(bt3);

        btPonto.setBounds(150,410,60,40);
        btPonto.setFont(new Font("Arial", Font.BOLD,20));
        btPonto.setFocusable(false);
        frame.add(btPonto);

        bt0.setBounds(10,410,130,40);
        bt0.setFont(new Font("Arial", Font.BOLD,20));
        bt0.setFocusable(false);
        frame.add(bt0);

        btEqual.setBounds(220,410,60,40);
        btEqual.setFont(new Font("Arial", Font.BOLD,20));
        btEqual.setBackground(new Color(239,188,2));
        btEqual.setFocusable(false);
        frame.add(btEqual);

        btDiv.setBounds(220,350,60,40);
        btDiv.setFont(new Font("Arial", Font.BOLD,20));
        btDiv.setBackground(new Color(239,188,2));
        btDiv.setFocusable(false);
        frame.add(btDiv);

        btMul.setBounds(220,230,60,40);
        btMul.setFont(new Font("Arial", Font.BOLD,20));
        btMul.setBackground(new Color(239,188,2));
        btMul.setFocusable(false);
        frame.add(btMul);

        btMinun.setBounds(220, 170,60,40);
        btMinun.setFont(new Font("Arial", Font.BOLD,20));
        btMinun.setBackground(new Color(239,188,2));
        btMinun.setFocusable(false);
        frame.add(btMinun);

        btPlus.setBounds(220,290,60,40);
        btPlus.setFont(new Font("Arial", Font.BOLD,20));
        btPlus.setBackground(new Color(239,188,2));
        btPlus.setFocusable(false);
        frame.add(btPlus);

        btDelete.setBounds(150,170,60,40);
        btDelete.setFont(new Font("Arial", Font.BOLD,16));
        btDelete.setBackground(Color.LIGHT_GRAY);
        btDelete.setForeground(Color.WHITE);
        btDelete.setFocusable(false);
        frame.add(btDelete);

        btClear.setBounds(80,170,60,40);
        btClear.setFont(new Font("Arial", Font.BOLD,20));
        btClear.setBackground(Color.LIGHT_GRAY);
        btClear.setForeground(Color.WHITE);
        btClear.setFocusable(false);
        frame.add(btClear);

    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.janela();
    }

}
