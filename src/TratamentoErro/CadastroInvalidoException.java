package TratamentoErro;

import javax.swing.*;

/**
 * Classe customizada de tratamento de erro. Aponta um erro no cadastro de: clientes, funcionários e produtos.
 */
public class CadastroInvalidoException extends RuntimeException{

    public CadastroInvalidoException(String erro) {
        super(erro);
        JOptionPane.showMessageDialog(null,erro);
    }
}
