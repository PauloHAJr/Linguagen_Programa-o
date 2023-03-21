package FranquiaAcai;

import javax.swing.*;
import java.text.NumberFormat;

public class PontoAcai {
    public static void main(String[] args) {
        NumberFormat z = NumberFormat.getCurrencyInstance();
        Acai acai1 = new Acai();

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual tamanho do Açaí desejado: \n1.300mL\n2.500mL\n3.700mL"));
        if (tamanho == 1)
            acai1.setValor(acai1.ValorAcai(300));
        else if (tamanho==2)
            acai1.setValor(acai1.ValorAcai(500));
        else if (tamanho==3)
            acai1.setValor(acai1.ValorAcai(700));

        int sorvete = Integer.parseInt(JOptionPane.showInputDialog("Terá acréscimo de sorvete: \n1.Sim \n2.Não"));
        boolean sim;
        if(sorvete==1)
            sim = true;
        else
            sim = false;
        acai1.setValor(acai1.AcrescimoSorvete(sim));

        JOptionPane.showMessageDialog(null,"O seu Açaí ficou no valor de: "+z.format(acai1.getValor()));
    }
}
