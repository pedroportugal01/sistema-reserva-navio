package br.fiap.carga;

import br.fiap.cliente.Cliente;

import java.util.Random;

public class Carga {

    private int id;
    private String destino;
    private double peso;
    private Cliente cliente;

    //Construtor


    public Carga(String destino, Cliente cliente) {
        this.destino = destino;
        this.cliente = cliente;

        // Gerando ID e Peso aleatorio
        Random gerador = new Random();
        this.id = gerador.nextInt(9000) + 1000;
        this.peso = 100 + (gerador.nextDouble() * 900);
    }

    //Getters e Setters

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

      public String getDados(){
        return "ID da Carga: " + id + "\nDestino: " + destino +
                String.format("\nPeso: %2f kg\n",peso) + cliente.getDados();
      }
}
