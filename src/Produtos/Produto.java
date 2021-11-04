package Produtos;

/**
 * Classe de dados do produto.
 */
public class Produto {

    private String nome;
    private double preco;
    private double desconto;
    private double precoDesconto;
    private int quantidade;
    private int tarjacodigo;
    private final String[] tarja = {"MIP", "Amarela", "Vermelha", "Preta"
    //MIP = Medicamentos Isentos de Prescrição (livre)
    //Amarela = Generico
    //Vermelha = Necessitam de uma prescrição assinada por um profissional da Saúde
    //Preta = precisam de um maior controle e cuidado na hora de receita
    };
    private String codigo;

    public Produto(String nome, String codigo, int quantidade, double preco, double desconto, int tarjacodigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
        this.desconto = desconto;
        setPrecoDesconto();
        this.tarjacodigo = tarjacodigo;
    }

    /*public Produtos.Produto() {
        setNome(JOptionPane.showInputDialog("Nome do remédio"));
        setCodigo(JOptionPane.showInputDialog("Código do produto"));
        setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque")));
        setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço")));
        setDesconto(Double.parseDouble(JOptionPane.showInputDialog("Desconto")));
        setPrecoDesconto();
        setTarja(Integer.parseInt(JOptionPane.showInputDialog("Tarja\n0: MIP\n 1: Amarela\n 2:Vermelha\n 3:Preta")));

    }
     */

    public double getPrecoDesconto() {
        return precoDesconto;
    }

    public void setPrecoDesconto() {
        this.precoDesconto = getPreco()-getDesconto();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTarja(){
        return tarja[this.tarjacodigo];
    }


    @Override
    public String toString() {
        return "Nome: " + getNome() +
                ", Preço: " + getPreco() +
                ", Desconto: " + getDesconto() +
                ", Preço com desconto: " + getPrecoDesconto() +
                ", Codigo do produto: " + getCodigo() +
                ", Quantidade em estoque: " + getQuantidade() +
                ", Tarja: " + getTarja();
    }
}
