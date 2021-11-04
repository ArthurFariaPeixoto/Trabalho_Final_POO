package Produtos;

import Main.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe responsavel por imprimir as informacoes do arquivo "Produto" na tela.
 */
public class ProdutoRetorno implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.arquivo.leArquivo("Produto");
    }
}
