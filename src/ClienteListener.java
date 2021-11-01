import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteListener implements ActionListener {

    private DB<Cliente> db = new ArquivoDB<>("Cliente");

    @Override
    public void actionPerformed(ActionEvent e) {
        String nomeCompleto = JOptionPane.showInputDialog("Nome Completo");
        String cpf = JOptionPane.showInputDialog("CPF");
        String dataDeNascimento = JOptionPane.showInputDialog("Data de nascimento");

//        if (!isEmpty(nomeCompleto) && !isEmpty(cpf) && !isEmpty(dataDeNascimento)) {
            Cliente cliente = new Cliente(0, nomeCompleto, cpf, dataDeNascimento);
            db.salvar(cliente);
//        }
    }
}
