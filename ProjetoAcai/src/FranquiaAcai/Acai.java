package FranquiaAcai;

public class Acai {
    public int tamanho;
    public double valor;
    public boolean acrescimoSorvete;

    public Acai() {
    }

    public double ValorAcai(int tamanhoEscolido) {
        if (tamanhoEscolido == 300)
            return valor += 8.00;
        else if (tamanhoEscolido == 500)
            return valor += 10.00;
        else if (tamanhoEscolido == 700)
            return valor += 12.00;
        return valor;
    }

    public double AcrescimoSorvete(boolean possuiSorvete){
        if(possuiSorvete)
            return valor+=2.00;
        return valor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean getAcrescimoSorvete() {
        return acrescimoSorvete;
    }

    public void setAcrescimoSorvete(boolean acrescimoSorvete) {
        this.acrescimoSorvete = acrescimoSorvete;
    }
}
