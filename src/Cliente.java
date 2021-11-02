public class Cliente extends Pessoa{
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return  "ID: " + identificacao_Sequencial +
                ", Nome: " + getNome() +
                ", CPF: " + getCpf() +
                ", Data de nascimento: " + getDataNascimento();
    }

    public Cliente(Integer identificacao, String nome, String cpf, String dataNascimento) {
        identificacao_Sequencial = identificacao;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    /*public Cliente() {
        identificacao_Sequencial += 1;
        setNome(JOptionPane.showInputDialog("Nome Completo"));
        setCpf(JOptionPane.showInputDialog("CPF"));
        setDataNascimento(JOptionPane.showInputDialog("Data de nascimento"));
    }
     */
}
