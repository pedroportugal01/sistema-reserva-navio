package br.fiap.aplicacao;

import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.viagem.Viagem;

import javax.swing.*;

public class AppMenu {public static void main(String[] args) {
    Viagem viagem = new Viagem();
    int opcao = 0;

    // Texto do menu conforme imagem do material
    String menu = "Reserva de Cargas Boa Viagem\n\n"
            + "1. Realizar reserva\n"
            + "2. Pesquisar reserva\n"
            + "3. Visualizar reservas\n"
            + "4. Capacidade reservada\n"
            + "5. Cancelar reserva\n"
            + "6. Encerrar programa\n\n"
            + "Escolha uma opção:";

    while (opcao != 6) {
        String auxOpcao = JOptionPane.showInputDialog(null, menu, "Input", JOptionPane.QUESTION_MESSAGE);

        // Se o usuário clicar em "Cancelar" ou fechar a janela, encerra para não dar erro
        if (auxOpcao == null) {
            break;
        }

        opcao = Integer.parseInt(auxOpcao); // Conversão de tipo como visto nos slides

        switch (opcao) {
            case 1:
                String nome = JOptionPane.showInputDialog("Informe o nome do cliente:");
                String cnpj = JOptionPane.showInputDialog("Informe o CNPJ do cliente:");
                String destino = JOptionPane.showInputDialog("Informe o destino da carga:");

                Cliente cliente = new Cliente(nome, cnpj);
                Carga carga = new Carga(destino, cliente);

                if (viagem.reservar(carga)) {
                    JOptionPane.showMessageDialog(null, "Reserva realizada!\n" + carga.getDados(),
                            "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível reservar. O navio não tem espaço ou o peso excede o limite.",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
                break;

            case 2:
                String buscaCnpj = JOptionPane.showInputDialog("Digite o CNPJ para pesquisa:");
                String resultadoBusca = viagem.pesquisarPorCnpj(buscaCnpj);
                JOptionPane.showMessageDialog(null, resultadoBusca, "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, viagem.getDados(), "Todas as Reservas", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 4:
                String cap = String.format("Capacidade já reservada: %.2f kg de 10000.00 kg", viagem.capacidadeReservada());
                JOptionPane.showMessageDialog(null, cap, "Capacidade", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 5:
                String auxId = JOptionPane.showInputDialog("Informe o ID da carga para cancelar:");
                int idCancelamento = Integer.parseInt(auxId);

                if (viagem.cancelarReserva(idCancelamento)) {
                    JOptionPane.showMessageDialog(null, "Reserva cancelada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "ID não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Programa encerrado.");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}
}

