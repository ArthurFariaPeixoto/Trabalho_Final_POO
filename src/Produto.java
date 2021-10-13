public class Produto {

    private String nome;
    private double preco;
    private double desconto;
    private String codigo;
    private final String[] tarja = {"MIP",
            "Amarela",
            "Vermelha",
            "Preta"
    //MIP = Medicamentos Isentos de Prescrição (livre)
    //Amarela = Generico
    //Vermelha = Necessitam de uma prescrição assinada por um profissional da Saúde
    //Preta = precisam de um maior controle e cuidado na hora de receita
    };


    private static int identificacao_Sequencial = 0;


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


    public Produto() {
        identificacao_Sequencial+=1;
    }
}
