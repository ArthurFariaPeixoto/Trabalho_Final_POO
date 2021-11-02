package Pessoas.funcionarios;

import Main.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FuncionarioRetorno implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.arquivo.leArquivo("Pessoas.funcionarios.Funcionario");
    }
}
