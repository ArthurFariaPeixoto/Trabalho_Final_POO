public class Cliente extends Pessoa{

    private String cpf;
    private static int identificacao_Sequencial = 0;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public Cliente() {
        identificacao_Sequencial += 1;
    }
}
