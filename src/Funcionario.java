public class Funcionario extends Pessoa{

    private double salario;
    private int horas_semanais;
    private double bonificacao;
    private int vendas;
    private final String[] avaliacao = {"Pessima","Ruim","Regular","Bom", "Excelente"};

    private static int identificacao_Sequencial = 0;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario+getBonificacao();
    }

    public int getHoras_semanais() {
        return horas_semanais;
    }

    public void setHoras_semanais(int horas_semanais) {
        this.horas_semanais = horas_semanais;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = (bonificacao/100) * getVendas();
    }

    public String avaliacaoFuncionario(int nota){
        return avaliacao[nota];
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public Funcionario() {
        identificacao_Sequencial += 1;
    }
}
