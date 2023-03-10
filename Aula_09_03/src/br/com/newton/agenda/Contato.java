package br.com.newton.agenda;

public class Contato {

    private String nome;
    private String numero;

    //Criar um método Excluir que não tenha retorno e que receba
    //como parâmetro um contato a ser eexcluido
    //Escrever uma mensagem "Excluindo o contato" nome do contato

    public void Excluir(Contato contato){
        System.out.println("Excluindo contato...");
        System.out.println("Contato "+contato.nome+" numero "+contato.numero+" foi excuido.");
    }

    public void Incluir(Contato contato){
        System.out.println("Incluindo contato...");
        System.out.println("Contato "+contato.nome+" numero "+contato.numero+" foi incluido.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}