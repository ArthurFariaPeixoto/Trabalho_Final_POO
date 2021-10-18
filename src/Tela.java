import javax.swing.*;
import java.awt.*;

public class Tela extends JFrame {

    private final int WIDTH = 1080, HEIGHT = 720;
    JFrame tela = new JFrame();

    public Tela(){
        criaTela();
    }

    public void criaTela(){
        tela.setSize(WIDTH, HEIGHT);
        tela.setTitle("Gerenciamento de Farmácia");
        tela.setVisible(true);
        tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tela.requestFocus();
        tela.setLocationRelativeTo(null);
        tela.getContentPane().setBackground(Color.BLACK);
    }

}
