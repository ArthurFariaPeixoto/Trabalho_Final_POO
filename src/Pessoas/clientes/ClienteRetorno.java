package Pessoas.clientes;

import Main.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe responsável por imprimir as informações do arquivo "Cliente" na tela.
 */
public class ClienteRetorno implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.arquivo.leArquivo("Cliente");
    }
}
