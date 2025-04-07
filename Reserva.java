// Nome: Gustavo do Bem Ferreira, Matricula: 202065036AC

import java.sql.Date;

// Classe Reserva, que faz a associação entre Hospede e Quarto
public class Reserva {
    private Hospede hospede; // Associação
    private Quarto quarto;
    private Date dataInicio;
    private Date dataFim;

    // Inicializar uma reserva com os detalhes necessários
    public Reserva(Hospede hospede, Quarto quarto, String dataInicio, String dataFim) {
        this.hospede = hospede;
        this.quarto = quarto;
        // Convertendo as datas para o formato certo
        this.dataInicio = Date.valueOf(dataInicio);
        this.dataFim = Date.valueOf(dataFim);
    }
    
    // Retorna o hóspede associado à reserva
    public Hospede getHospede() {
        return hospede;
    }

    // Retorna o quarto associado à reserva
    public Quarto getQuarto(){
        return quarto;
    }

    // Retorna a data de início da reserva
    public Date getDataInicio() {
        return dataInicio;
    }

    // Retorna a data de fim da reserva
    public Date getDataFim() {
        return dataFim;
    }

    // Calcula o valor total da reserva com base no preço do quarto e duração da estadia
    // Composição
    public double calcularTotal() {
        double diferencaDias = ((dataFim.getTime() - dataInicio.getTime())) / (1000 * 60 * 60 * 24);
        return diferencaDias * Quarto.getPreco();
    }

    // Sobrescreve o método toString para exibir informações úteis da reserva
    @Override
    public String toString() {
        return "Reserva [Hóspede: " + hospede.getNome() + ", Quarto: " + quarto.getNumero() +
           ", Período: " + dataInicio + " até " + dataFim + "]";
    }
}
