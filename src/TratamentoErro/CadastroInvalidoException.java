package TratamentoErro;

import javax.swing.*;

public class CadastroInvalidoException extends RuntimeException{

    public CadastroInvalidoException(String erro) {
        super(erro);
        JOptionPane.showMessageDialog(null,erro);
    }
}
