package br.com.senai.model;

public class Pagamento {

    //atributos
    private String fdpg;
    private double valor;

    public Pagamento(String fdpg, double valor){
        this.fdpg = fdpg;
        this.valor = valor;
    }

    //método
    @Override
    public String toString() {
        return "\nForma de Pagamento: " + fdpg +
                "\nValor: " + valor;
    }
}