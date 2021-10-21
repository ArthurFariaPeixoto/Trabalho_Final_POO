import javax.swing.*;
import java.util.Arrays;

public class Funcionario extends Pessoa{

    private double salario;
    private int horas_semanais;
    private double bonificacao=0;
    private int vendas=0;
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

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                ", Data de nascimento: " + getDataNascimento() +
                ", Vendas: " + getVendas() +
                ", Horas semanais: " + getHoras_semanais() +
                ", Bonificacao: " + getBonificacao() +
                ", Salario: " + getSalario();
    }

    public Funcionario() {
        identificacao_Sequencial += 1;
        setNome(JOptionPane.showInputDialog("Nome Completo"));
        setDataNascimento(JOptionPane.showInputDialog("Data de nascimento"));
        setHoras_semanais(Integer.parseInt(JOptionPane.showInputDialog("Horas semanais de serviço")));
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salário base")));
    }
}
