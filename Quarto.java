// Nome: Gustavo do Bem Ferreira, Matricula: 202065036AC

public class Quarto {
    // Encapsulamento
    private int numQuarto; // Número único identificador do quarto
    private static double preco = 300.00; // Preço padrão do quarto (atributo estático)
    private static int totalQuartos = 0; // Atributo estático para contar para total de quartos registrados 
    private boolean ocupado; // Indica se o quarto está ocupado ou não

    // Construtor para inicializar um quarto com o número fornecido
    public Quarto(int numQuarto) {
        this.numQuarto = numQuarto;
        this.ocupado = false; // Inicialmente, o quarto está livre
        totalQuartos++; // Incrementa o contador de quartos ao criar um novo quarto
    }

    // Retorna o número único do quarto
    public int getNumero() {
        return numQuarto;
    }

    // Retorna o preço padrão do quarto
    public static double getPreco() {
        return preco;
    }

    // Retorna o total de quartos registrados
    public static int getTotalQuartos() {
        return totalQuartos;
    }

    // Retorna se o quarto está ocupado ou não
    public boolean getOcupado(){
        return ocupado;
    }

    // Atualiza o estado do quarto (ocupado ou livre)
    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }

    // Método estático para atualizar o preço padrão do quarto
    public static void setPreco(double preco) {
        Quarto.preco = preco;
    }

    // Sobrescreve o método toString para exibir informações úteis do quarto
    @Override
    public String toString() {
        return "Quarto número: " + numQuarto + ", Ocupado: " + ocupado + ", Preço: R$" + preco;
    }
}
