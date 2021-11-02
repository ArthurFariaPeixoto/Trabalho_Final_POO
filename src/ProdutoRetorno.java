import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProdutoRetorno implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.arquivo.leArquivo("Produto");
    }
}
