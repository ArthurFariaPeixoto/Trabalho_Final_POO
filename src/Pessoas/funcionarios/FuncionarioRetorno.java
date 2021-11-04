package Pessoas.funcionarios;

import Main.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe responsável por imprimir as informações do arquivo "Funcionario" na tela.
 */
public class FuncionarioRetorno implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.arquivo.leArquivo("Funcionario");
    }
}
