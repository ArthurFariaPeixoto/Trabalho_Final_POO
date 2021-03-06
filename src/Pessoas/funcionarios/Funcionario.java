package Pessoas.funcionarios;

import Pessoas.Pessoa;

/**
 * Classe de dados do funcionario.
 */
public class Funcionario extends Pessoa {

    private double salario;
    private int horas_semanais;
    private double bonificacao;
    private int vendas;
    private int rendimentoNota;
    private final String[] rendimento = {"Pessimo","Ruim","Regular","Bom", "Excelente"};


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario+getBonificacao();
    }

    public int getHoras_semanais() {
        return horas_semanais;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = (bonificacao/100) * getVendas();
    }

    public String rendimentoFuncionario(){
        return rendimento[rendimentoNota];
    }

    public int getVendas() {
        if(this.vendas<=5){
            rendimentoNota = 0;
        }
        else if(this.vendas > 5 && this.vendas <= 10){
            rendimentoNota = 1;
        }
        else if(this.vendas > 10 && this.vendas <= 15){
            rendimentoNota = 2;
        }
        else if(this.vendas >15 && this.vendas <= 20){
            rendimentoNota = 3;
        }
        else if(this.vendas>20){
            rendimentoNota = 4;
        }
        return vendas;
    }

    @Override
    public String toString() {
        return  "ID: "+identificacao_Sequencial+
                ", Nome: " + getNome() +
                ", Data de nascimento: " + getDataNascimento() +
                ", Vendas: " + getVendas() +
                ", Horas semanais: " + getHoras_semanais() +
                ", Bonificacao: " + getBonificacao() +
                ", Salario: " + getSalario() +
                ", Rendimento do funcionario: " + rendimentoFuncionario();
    }

    public Funcionario(Integer identificacao, String nome, String data, int horas_semanais, int vendas, double salario) {
        identificacao_Sequencial = identificacao;
        this.nome = nome;
        this.dataNascimento = data;
        this.horas_semanais = horas_semanais;
        this.vendas = vendas;
        setBonificacao(10);
        setSalario(salario);
    }
}
