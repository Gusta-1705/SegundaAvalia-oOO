// Nome: Gustavo do Bem Ferreira, Matricula: 202065036AC

import java.util.List;
import java.util.ArrayList;

// Especialização de Pessoa e Herança herdando de pessoa
public class Hospede extends Pessoa{
    // Uso de Coleções
    private List<Reserva> reservas; // Lista de reservas associadas ao hóspede
    
    // Construtor para inicializar um hóspede com nome, idade e CPF
    public Hospede(String nome, int idade, String cpf) {
        // Herança
        super(nome, idade, cpf); // Chama o construtor da classe abstrata Pessoa
        this.reservas = new ArrayList<>(); // Inicializa a lista de reservas
    }

    // Adiciona uma reserva à lista de reservas do hóspede
    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    // Remove uma reserva da lista de reservas do hóspede
    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    // Retorna a lista de reservas associadas ao hóspede
    public List<Reserva> getReservas() {
        return reservas;
    }

    // Sobrescreve o método abstrato exibirDados da classe Pessoa
    // Polimorfismo
    @Override
    public void exibirDados() {
        System.out.println("Hóspede: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + getCpf());
    }

    // Sobrescreve o método toString para exibir informações úteis do hóspede
    @Override
    public String toString() {
        return "Hóspede: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + getCpf();
    }
}
