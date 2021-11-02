import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExcluiListaCliente implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.arquivo.deletaArquivo("Cliente");
    }
}
