package br.com.newton;

import java.util.List;

public class Pedido{
    Cliente c;
    Massa m;
    List<Ingrediente> ListaIngrediente;

    public double CalculaValor(){
        double valorInicial = m.valor;
        int qtdIngEscolidos= ListaIngrediente.size();
        double valorIngredientes = qtdIngEscolidos*2;
        return valorInicial+valorIngredientes;
    }

}
////////tentativa anterior
/*    private float valorIngrediente, valorPedido;
    Cliente c1 = new Cliente();
    Massa m1 = new Massa();
    Ingrediente i1 = new Ingrediente();

    public void setValorIngrediente(float valorIngrediente) {
        this.valorIngrediente = valorIngrediente;
        if(i1.getBacon())
            valorIngrediente+=2;
        else if(i1.getMussarela())
            valorIngrediente+=2;
        else if(i1.getTomate())
            valorIngrediente+=2;
        else if(i1.getQueijo())
            valorIngrediente+=2;
    }

    public float getValorIngrediente() {
        return valorIngrediente;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido() {
        this.valorPedido = m1.getValor()+valorIngrediente;
    }
    public void MostraCliente(){
        c1.getNome();
    }
    public void setCliente(String nome){
        c1.setNome(nome);
    }*/
