package PizzaHamburguer;

public class Hamburguer {
    public String nome;
    public double valor;
    public boolean artesanal;

    public Hamburguer() {
    }

    public double CalcularValor(boolean artesanal){
        if(artesanal)
            return valor+=8.00;
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

    public boolean isArtesanal() {
        return artesanal;
    }

    public void setArtesanal(boolean artesanal) {
        this.artesanal = artesanal;
    }
}
