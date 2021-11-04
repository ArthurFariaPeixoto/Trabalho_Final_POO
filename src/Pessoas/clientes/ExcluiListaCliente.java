package Pessoas.clientes;

import Main.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe responsável por deletar o arquivo "Cliente".
 */
public class ExcluiListaCliente implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.arquivo.deletaArquivo("Cliente");
    }
}
