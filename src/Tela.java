import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame implements ActionListener {

    private final int WIDTH = 1080, HEIGHT = 720;
    JButton botaoCliente = new JButton("Cliente");

    public Tela(){
        criaTela();
    }

    public void criaTela(){
        setLayout(null);

        Main.tela.setSize(WIDTH, HEIGHT);
        Main.tela.setTitle("Gerenciamento de Farmácia");
        Main.tela.setVisible(true);
        Main.tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Main.tela.setFocusable(true);
        Main.tela.requestFocus();
        Main.tela.setLocationRelativeTo(null);
        Main.tela.setResizable(false);
        Main.tela.getContentPane().setBackground(Color.BLACK);

        botaoCliente.setBounds(10,10,100,50);
        Main.tela.add(botaoCliente);
        botaoCliente.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botaoCliente){

        }

    }
}
