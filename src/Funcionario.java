public class Funcionario extends Pessoa{

    private double salario;
    private int horas_semanais;
    private double bonificacao;
    private final String[] avaliacao = {"Pessima","Ruim","Regular","Bom", "Excelente"};

    private static int identificacao_Sequencial = 0;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
        this.bonificacao = bonificacao;
    }

    public String avaliacaoFuncionario(int nota){
        return avaliacao[nota];
    }


    public Funcionario() {
        identificacao_Sequencial += 1;
    }
}
