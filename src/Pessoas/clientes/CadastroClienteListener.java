package Pessoas.clientes;

import Main.Main;
import TratamentoErro.CadastroInvalidoException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroClienteListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String nomeCompleto = JOptionPane.showInputDialog("Nome Completo");
        String cpf = JOptionPane.showInputDialog("CPF");
        String dataDeNascimento = JOptionPane.showInputDialog("Data de nascimento");
        String erro = "Erro ao cadastrar cliente, tente novamente!";

        if (nomeCompleto != null && !nomeCompleto.equals(" ") && cpf != null && !cpf.equals(" ") && dataDeNascimento != null && !dataDeNascimento.equals(" ")) {
            Cliente cliente = new Cliente(++Main.sequencialCliente, nomeCompleto, cpf, dataDeNascimento);
            Main.listaCLientes.add(cliente);
            Main.arquivo.escreveArquivo("Cliente", cliente.toString() + "\n");
        }
        else{
            JOptionPane.showMessageDialog(null,erro);
            throw new CadastroInvalidoException(erro);
        }
    }
}
