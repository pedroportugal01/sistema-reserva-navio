# 🚢 Sistema de Reserva de Cargas - Navio "Boa Viagem"

Este projeto foi desenvolvido como parte do aprendizado de **Programação Orientada a Objetos (POO)** em Java. O objetivo principal é aplicar conceitos de **Encapsulamento**, organização de pacotes e interação com o usuário através de janelas gráficas (`Swing`).

## 📋 Sobre o Projeto
O sistema permite que empresas realizem a reserva de cargas para transporte marítimo. O navio possui regras de negócio específicas para garantir a segurança e a integridade da viagem.

### Principais Funcionalidades:
1. **Realizar Reserva:** Cadastra um cliente e gera uma carga com ID e Peso automáticos.
2. **Validação de Espaço:** O sistema impede reservas caso o limite de 10.000 kg seja atingido ou o limite de 20 cargas no navio seja excedido.
3. **Pesquisa por Cliente:** Busca reservas específicas através do CNPJ.
4. **Gestão de Cargas:** Listagem total de reservas e cancelamento de itens por ID.
5. **Interface Gráfica:** Uso da classe `JOptionPane` para uma experiência visual no Windows/Linux/Mac.

## 🛠️ Tecnologias Utilizadas
* **Java JDK 17+**
* **JOptionPane (Swing):** Para janelas de diálogo.
* **Encapsulamento:** Uso rigoroso de modificadores de acesso `private` e métodos `get/set`.
* **Random:** Geração automática de dados de carga.

## 📂 Estrutura de Pacotes
O projeto segue a padronização solicitada:
* `br.fiap.cliente`: Classe Cliente.
* `br.fiap.carga`: Classe Carga.
* `br.fiap.viagem`: Lógica da Viagem e Array de Cargas.
* `br.fiap.aplicacao`: Classe principal com o Menu de opções.
