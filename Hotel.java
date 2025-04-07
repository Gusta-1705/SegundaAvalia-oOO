// Nome: Gustavo do Bem Ferreira, Matricula: 202065036AC

import java.util.List;
import java.util.ArrayList;

// Sistema principal para gerenciar o hotel
public class Hotel implements Reservavel {
    private String nome;
    // Agregação
    private List<Quarto> quartos; // Lista de quartos no hotel
    private List<Hospede> hospedes; // Lista de hóspedes registrados
    private List<Reserva> reservas; // Lista de reservas realizadas

    // Inicializando os atributos do hotel
    public Hotel(String nome) {
        this.nome = nome;
        this.quartos = new ArrayList<>(); // Coleções
        this.hospedes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }
    
    //Retorna o nome do hotel
    public String getNome() {
        return nome;
    }

    // Cadastra um novo hóspede no hotel
    public void cadastrarHospede(String nome, int idade, String cpf) {
        Hospede hospede = new Hospede(nome, idade, cpf);
        hospedes.add(hospede);
    }

    // Registra um novo quarto com o número fornecido
    public void registrarQuarto(int numQuarto) {
        Quarto quarto = new Quarto(numQuarto);
        quartos.add(quarto);
    }

    // Registra um novo quarto com número e preço
    // Sobrecarga do método registrarQuarto
    public void registrarQuarto(int numero, double preco) {
        Quarto quarto = new Quarto(numero);
        Quarto.setPreco(preco); 
        quartos.add(quarto);
    }

    // Registra uma nova reserva para o hóspede em um quarto específico
    @Override
    public void registrarReserva(Hospede hospede, int numQuarto, String dataInicio, String dataFim) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numQuarto && !quarto.getOcupado()) {
                Reserva reserva = new Reserva(hospede, quarto, dataInicio, dataFim);
                reservas.add(reserva);
                hospede.adicionarReserva(reserva);
                quarto.setOcupado(true);
            }
        }
    }

    // Cancela uma reserva específica
    @Override
    public void cancelarReserva(Reserva reserva) {
        reserva.getQuarto().setOcupado(false);
        reserva.getHospede().cancelarReserva(reserva);
        reservas.remove(reserva);
    }

    // Registra a entrada de um hóspede no hotel
    public void registrarEntrada(Hospede hospede) {
        System.out.println(hospede.getNome() + " realizou check-in.");
    }

    // Finaliza a estadia de um hóspede e exibe o valor total devido
    public void registrarSaida(Hospede hospede) {
        double total = 0;
        for (Reserva reserva : hospede.getReservas()) {
            total += reserva.calcularTotal();
        }
        System.out.println(hospede.getNome() + " realizou check-out. Total a pagar: R$" + total);
    }

    // Retorna a lista de quartos registrados
    public List<Quarto> getQuartos() {
        return quartos;
    }

    // Retorna a lista de hóspedes registrados
    public List<Hospede> getHospedes() {
        return hospedes;
    }

    // Retorna a lista de reservas realizadas
    @Override
    public List<Reserva> getReservas() {
        return reservas; 
    }
}
