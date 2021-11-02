package Produtos;

import Main.Main;
import TratamentoErro.CadastroInvalidoException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroProdutoListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String erro = "Erro ao cadastrar produto, tente novamente!";
        String nomeCompleto = JOptionPane.showInputDialog("Nome do remédio");
        String codigo = JOptionPane.showInputDialog("Código do produto");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque"));
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço"));
        double desconto = Double.parseDouble(JOptionPane.showInputDialog("Desconto"));
        int tarja = Integer.parseInt(JOptionPane.showInputDialog("Tarja\n0: MIP\n 1: Amarela\n 2:Vermelha\n 3:Preta"));

        if (nomeCompleto != null && !nomeCompleto.equals(" ") && codigo != null && !codigo.equals(" ") && quantidade!= 0 && preco != 0) {
            Produto produto = new Produto(nomeCompleto, codigo, quantidade, preco, desconto, tarja);
            Main.listaProdutos.add(produto);
            Main.arquivo.escreveArquivo("Produtos.Produto", produto.toString() + "\n");
        }
        else{
            JOptionPane.showMessageDialog(null,erro);
            throw new CadastroInvalidoException(erro);
        }
    }
}
