package Pessoas.funcionarios;

import Main.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExcluiListaFuncionario implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.arquivo.deletaArquivo("Pessoas.funcionarios.Funcionario");
    }
}
