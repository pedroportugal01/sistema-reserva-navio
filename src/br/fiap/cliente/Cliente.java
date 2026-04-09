package br.fiap.cliente;

public class Cliente {

    private int cnpj;
    private String cliente;

    //Construtor
    public Cliente(int cnpj, String cliente) {
        this.cnpj = cnpj;
        this.cliente = cliente;
    }


    //Getters e Setters
    public String getCliente(){
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    //Método que retorna os dados do objeto
    public String getDados(){
        return "Cliente: " + cliente +" | CNPJ: " + cnpj;
    }
}
