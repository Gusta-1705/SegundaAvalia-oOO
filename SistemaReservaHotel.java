// Nome: Gustavo do Bem Ferreira, Matricula: 202065036AC

// OBS: Tentei implementar todos os conceitos utilizados até essa avaliação

// Classe principal para teste do sistema
public class SistemaReservaHotel {
    public static void main(String[] args) {
        // Criando um objeto do tipo hotel
        Hotel hotel = new Hotel("Constantino");
        
        // Cadastrando quartos
        hotel.registrarQuarto(101);
        hotel.registrarQuarto(102);
        hotel.registrarQuarto(103);

        // Cadastrando hóspedes
        hotel.cadastrarHospede("Gustavo", 23, "123.456.789-00");
        hotel.cadastrarHospede("Ana", 30, "987.654.321-00");

        // Obtendo hóspedes cadastrados
        Hospede hospede1 = hotel.getHospedes().get(0); // Gustavo
        Hospede hospede2 = hotel.getHospedes().get(1); // Ana

        // Registrando reservas
        hotel.registrarReserva(hospede1, 101, "2025-04-06", "2025-04-09");
        hotel.registrarReserva(hospede2, 102, "2025-04-06", "2025-04-10");

        //Listando o hotel e todos os quartos disponíveis
        System.out.println("O Hotel " + hotel.getNome() + " possui os seguintes quartos: ");
        Utilitaria.imprimirLista(hotel.getQuartos());

        // Exibindo a quantidade total de quartos
        System.out.println("Quantidade de quartos registrados: " + Quarto.getTotalQuartos());

        // Listando hóspedes cadastrados
        System.out.println("\nHóspedes registrados:");
        Utilitaria.imprimirLista(hotel.getHospedes());

        System.out.println();

        // Listando reservas feitas
        System.out.println("Reservas realizadas:");
        for (Reserva reserva : hotel.getReservas()) {
            System.out.println("Hóspede: " + reserva.getHospede().getNome() +
                               ", Quarto: " + reserva.getQuarto().getNumero() +
                               ", Período: " + reserva.getDataInicio() + " até " + reserva.getDataFim());
        }
        System.out.println();

        // Realizando check-in
        hotel.registrarEntrada(hospede1);
        hotel.registrarEntrada(hospede2);

        System.out.println();

        // Finalizando a estadia e realizando check-out
        hotel.registrarSaida(hospede1);
        hotel.registrarSaida(hospede2);

        System.out.println();

        // Cancelando uma reserva
        Reserva reservaCancelada = hotel.getReservas().get(0);
        hotel.cancelarReserva(reservaCancelada);
        System.out.println("Reserva cancelada para o quarto: " + reservaCancelada.getQuarto().getNumero());

        System.out.println();

        // Exibindo novamente as reservas após o cancelamento
        System.out.println("Reservas realizadas:");
        for (Reserva reserva : hotel.getReservas()) {
            System.out.println("Hóspede: " + reserva.getHospede().getNome() +
                               ", Quarto: " + reserva.getQuarto().getNumero() +
                               ", Período: " + reserva.getDataInicio() + " até " + reserva.getDataFim());
        }
    }
}