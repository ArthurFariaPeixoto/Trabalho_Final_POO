import javax.swing.*;

public class Tela extends JFrame {
    private final int WIDTH = 1080, HEIGHT = 720;

    JFrame tela = new JFrame();

    public Tela(){
        tela.setSize(WIDTH, HEIGHT);
        tela.setTitle("Tela");
        tela.setVisible(true);
        tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
