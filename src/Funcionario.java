public class Funcionario extends Pessoa{

    private double salario;
    private int horas_semanais;
    private double bonificacao;

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
}
