package Pessoas.funcionarios;

import Main.Main;
import TratamentoErro.CadastroInvalidoException;
import TratamentoErro.SenhaInvalidaException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * Classe responsavel pela leitura de dados informada pelo usuario e pela criacao de um novo funcionario e logo depois o registra no arquivo.
 */
public class CadastroFuncionarioListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String senha = JOptionPane.showInputDialog("Digite a senha:");
        String erroSenha = "Senha invalida, tente novamente!";

        if(Objects.equals(senha, "admin")){
            String nomeCompleto = JOptionPane.showInputDialog("Nome Completo");
            String dataDeNascimento = JOptionPane.showInputDialog("Data de nascimento");
            int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas semanais de serviço"));
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário base"));
            int vendas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de vendas"));
            String erro = "Erro ao cadastrar funcionario, tente novamente!";

            if (nomeCompleto != null && !nomeCompleto.equals("") && salario > 0 && horas > 0 && dataDeNascimento != null && !dataDeNascimento.equals("")) {
                Funcionario funcionario = new Funcionario(++Main.sequencialFuncionario, nomeCompleto, dataDeNascimento, horas, vendas, salario);
                Main.listaFuncionarios.add(funcionario);
                Main.arquivo.escreveArquivo("Funcionario", funcionario.toString() + "\n");
            }
            else{
                throw new CadastroInvalidoException(erro);
            }
        }
        else{
            throw new SenhaInvalidaException(erroSenha);
        }

    }
}
