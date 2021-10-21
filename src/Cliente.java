import javax.swing.*;

public class Cliente extends Pessoa{
    
    private String cpf;
    private final String[] forma_Pagamento = {"Débito","Crédito","Espécie","Cheque"};

    private static int identificacao_Sequencial = 0;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getForma_Pagamento(int forma) {
        return forma_Pagamento[forma];
    }

    @Override
    public String toString() {
        return  "Nome: " + getNome() +
                ", CPF: " + getCpf() +
                ", Data de nascimento: " + getDataNascimento();
    }

    public Cliente() {
        identificacao_Sequencial += 1;
        setNome(JOptionPane.showInputDialog("Nome Completo"));
        setCpf(JOptionPane.showInputDialog("CPF"));
        setDataNascimento(JOptionPane.showInputDialog("Data de nascimento"));
    }
}
