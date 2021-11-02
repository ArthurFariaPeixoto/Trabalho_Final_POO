package Produtos;

import Main.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExcluiListaProduto implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.arquivo.deletaArquivo("Produtos.Produto");
    }
}
