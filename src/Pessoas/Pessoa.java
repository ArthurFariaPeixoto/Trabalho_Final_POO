package Pessoas;

/**
 * Classe abstrata com dados comuns entre clientes e funcionários.
 */
public abstract class Pessoa {

    protected Integer identificacao_Sequencial;
    protected String nome;
    protected String dataNascimento;


    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}
