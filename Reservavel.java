// Nome: Gustavo do Bem Ferreira, Matricula: 202065036AC

import java.util.List;

// Interface com os métodos necessários para gerenciar reservas
public interface Reservavel {
    void registrarReserva(Hospede hospede, int numQuarto, String dataInicio, String dataFim);
    void cancelarReserva(Reserva reserva);
    List<Reserva> getReservas();
}
