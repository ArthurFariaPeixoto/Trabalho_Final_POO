package Produtos;

import Main.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe responsável por deletar o arquivo "Produto".
 */
public class ExcluiListaProduto implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.arquivo.deletaArquivo("Produto");
    }
}
