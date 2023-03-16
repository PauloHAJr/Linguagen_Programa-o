package PizzaHamburguer;

public class Pizza {
    public String nome;
    public double valor;
    public boolean possuiBorda;

    public Pizza() {
    }

    public double CalcularValor(boolean possuiBorda){
        if(possuiBorda)
            return valor+=5.00;
        return valor;
    }



    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPossuiBorda() {
        return possuiBorda;
    }

    public void setPossuiBorda(boolean possuiBorda) {
        this.possuiBorda = possuiBorda;
    }
}
