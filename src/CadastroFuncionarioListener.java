import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroFuncionarioListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String nomeCompleto = JOptionPane.showInputDialog("Nome Completo");
        String dataDeNascimento = JOptionPane.showInputDialog("Data de nascimento");
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas semanais de serviço"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário base"));
        //int rendimento = Integer.parseInt(JOptionPane.showInputDialog("Rendimento do funcionario\n 0: Pessimo\n 1: Ruim\n 2:Regular\n 3:Bom\n 4:Excelente"));
        int vendas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de vendas"));
        String erro = "Erro ao cadastrar funcionario, tente novamente!";


        if (nomeCompleto != null && !nomeCompleto.equals(" ") && salario!= 0 && vendas != 0 && horas != 0 && dataDeNascimento != null && !dataDeNascimento.equals(" ")) {
            Funcionario funcionario = new Funcionario(++Main.sequencialFuncionario, nomeCompleto, dataDeNascimento, horas, vendas, salario);
            Main.listaFuncionarios.add(funcionario);
            Main.arquivo.escreveArquivo("Funcionario", funcionario.toString() + "\n");
        }
        else{
            JOptionPane.showMessageDialog(null,erro);
        }
    }
}
