import javax.swing.*;
import java.util.Arrays;

public class Produto {

    private String nome;
    private double preco;
    private double desconto;
    private String codigo;
    private int quantidade;


    private double precoDesconto;
    private final String[] tarja = {"MIP", "Amarela", "Vermelha", "Preta"
    //MIP = Medicamentos Isentos de Prescrição (livre)
    //Amarela = Generico
    //Vermelha = Necessitam de uma prescrição assinada por um profissional da Saúde
    //Preta = precisam de um maior controle e cuidado na hora de receita
    };
    private static int identificacao_Sequencial = 0;


    public Produto() {
        identificacao_Sequencial+=1;
        setNome(JOptionPane.showInputDialog("Nome do remédio"));
        setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque")));
        setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço")));
        setDesconto(Double.parseDouble(JOptionPane.showInputDialog("Desconto")));
        setPrecoDesconto();

    }

    public double getPrecoDesconto() {
        return precoDesconto;
    }

    public void setPrecoDesconto() {
        this.precoDesconto = getPreco()-getDesconto();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTarja(int Tarja){
        return tarja[Tarja];
    }


    @Override
    public String toString() {
        return "Nome: " + getNome() +
                ", Preço: " + getPreco() +
                ", Desconto: " + getDesconto() +
                ", Preço com desconto: " + getPrecoDesconto() +
                ", Codigo: " + getCodigo() +
                ", Quantidade em estoque:" + getQuantidade() +
                ", Tarja: " + Arrays.toString(tarja);
    }
}
