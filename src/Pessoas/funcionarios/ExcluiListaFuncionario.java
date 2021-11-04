package Pessoas.funcionarios;

import Main.Main;
import TratamentoErro.SenhaInvalidaException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * Classe responsavel por deletar o arquivo "Funcionario".
 */
public class ExcluiListaFuncionario implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String senha = JOptionPane.showInputDialog("Digite a senha:");
        String erroSenha = "Senha invalida, tente novamente!";
        if(Objects.equals(senha, "admin")) {
            Main.arquivo.deletaArquivo("Funcionario");
        }
        else{
            throw new SenhaInvalidaException(erroSenha);
        }
    }
}
