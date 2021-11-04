package Produtos;

import Main.Main;
import TratamentoErro.SenhaInvalidaException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * Classe responsavel por deletar o arquivo "Produto".
 */
public class ExcluiListaProduto implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String senha = JOptionPane.showInputDialog("Digite a senha:");
        String erroSenha = "Senha invalida, tente novamente!";
        if(Objects.equals(senha, "admin")) {
            Main.arquivo.deletaArquivo("Produto");
        }
        else{
            throw new SenhaInvalidaException(erroSenha);
        }
    }
}
