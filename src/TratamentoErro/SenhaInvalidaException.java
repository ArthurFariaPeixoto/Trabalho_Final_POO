package TratamentoErro;

import javax.swing.*;

/**
 * Classe customizada de tratamento de erro. Aponta um erro ao digitar a senha de administrador errada.
 */
public class SenhaInvalidaException extends RuntimeException{

    public SenhaInvalidaException(String erro) {
        super(erro);
        JOptionPane.showMessageDialog(null,erro);
    }
}