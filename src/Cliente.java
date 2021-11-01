import javax.swing.*;

public class Cliente extends Pessoa{
    
    private String cpf;

    private static int identificacao_Sequencial = 0;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return  "ID: " + id +
                ", Nome: " + getNome() +
                ", CPF: " + getCpf() +
                ", Data de nascimento: " + getDataNascimento();
    }

    public Cliente(Integer id, String nome, String cpf, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    /*public Cliente() {
        identificacao_Sequencial += 1;
        setNome(JOptionPane.showInputDialog("Nome Completo"));
        setCpf(JOptionPane.showInputDialog("CPF"));
        setDataNascimento(JOptionPane.showInputDialog("Data de nascimento"));
    }*/
}
