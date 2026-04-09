package br.fiap.viagem;

import br.fiap.carga.Carga;

public class Viagem {

    private double capacidade;
    private int index;
    private Carga [] carga;

    public Viagem() {
        this.carga = new Carga[20];
        this.capacidade = 10000.0;
        this.index = 0;
    }

    //Calcula a capacidade já reservada

    public double capacidadeReservada() {
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += carga[i].getPeso();
        }
        return total;
    }

    // Verifica se há espaço no navio (peso total e vagas no array)
    public boolean permitidoReservar(double peso) {
        if (index >= carga.length) {
            return false; // Não há mais posições no array
        }
        if (capacidadeReservada() + peso > capacidade) {
            return false; // Ultrapassa o peso limite
        }
        return true;
    }

    // Realiza a reserva
    public boolean reservar(Carga c) {
        if (permitidoReservar(c.getPeso())) {
            carga[index] = c;
            index++;
            return true;
        }
        return false;
    }


    // Retorna os dados de todas as cargas
    public String getDados() {
        if (index == 0) return "Nenhuma reserva efetuada até o momento.";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.append("--- RESERVA ").append(i + 1).append(" ---\n");
            sb.append(carga[i].getDados()).append("\n\n");
        }
        return sb.toString();
    }


    // Método auxiliar para a Opção 2 (Pesquisar)
    public String pesquisarPorCnpj(String cnpj) {
        for (int i = 0; i < index; i++) {
            if (carga[i].getCliente().getCnpj()) {
                return carga[i].getDados();
            }
        }
        return "Nenhuma carga encontrada para o CNPJ informado.";
    }

    // Método auxiliar para a Opção 5 (Cancelar)
    public boolean cancelarReserva(int id) {
        for (int i = 0; i < index; i++) {
            if (carga[i].getId() == id) {
                // Desloca as cargas para trás para fechar o "buraco" no array
                for (int j = i; j < index - 1; j++) {
                    carga[j] = carga[j + 1];
                }
                carga[index - 1] = null;
                index--;
                return true;
            }
        }
        return false;


    }
}
