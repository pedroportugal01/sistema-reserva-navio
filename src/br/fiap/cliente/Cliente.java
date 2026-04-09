package br.fiap.cliente;

public class Cliente {
    // Alterado para String para suportar os dígitos do CNPJ e evitar erro de limite numérico
    private String cnpj;
    private String nome;

    // Construtor corrigido
    public Cliente(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Método que retorna os dados do objeto
    public String getDados() {
        return "Cliente: " + nome + " | CNPJ: " + cnpj;
    }
}