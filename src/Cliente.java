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


    public Cliente() {
        identificacao_Sequencial += 1;
    }
}
