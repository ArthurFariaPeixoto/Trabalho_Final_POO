public enum TipoProduto {
    MIP("Medicamentos Isentos de Prescrição (livre)");

    private final String descricao;

    TipoProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
