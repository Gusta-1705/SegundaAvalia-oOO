// Nome: Gustavo do Bem Ferreira, Matricula: 202065036AC

// Classe abstrata representando uma Pessoa no sistema
//Generalização
public abstract class Pessoa {
    // Encapsulamento
    private String nome;
    private int idade;
    private String cpf;

    // Construtor para instanciação dos atributos da pessoa
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    
    // Retorna o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Retorna a idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Retorna o CPF da pessoa
    public String getCpf() {
        return cpf;
    }

    // Método abstrato que deve ser implementado pelas subclasses (como Hospede)
    // Sobrescrita na classe Hóspede
    public abstract void exibirDados();
}
