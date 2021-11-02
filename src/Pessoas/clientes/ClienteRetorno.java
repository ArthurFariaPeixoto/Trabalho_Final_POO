package Pessoas.clientes;

import Main.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteRetorno implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.arquivo.leArquivo("Cliente");
    }
}
