import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame implements ActionListener {

    private final int WIDTH = 1080, HEIGHT = 720;
    JButton botaoClienteCadastro = new JButton("Cadastro cliente");
    JButton botaoFuncionario = new JButton("Funcionario");
    JButton botaoClienteRetorno = new JButton("Lista de Clientes");
    Arquivo arquivo = new Arquivo();

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

        botaoClienteCadastro.setBounds(10,10,150,50);
        Main.tela.add(botaoClienteCadastro);
        botaoClienteCadastro.addActionListener(this);

        botaoFuncionario.setBounds(10,70,150,50);
        Main.tela.add(botaoFuncionario);
        botaoFuncionario.addActionListener(this);

        botaoClienteRetorno.setBounds(170,10,150,50);
        Main.tela.add(botaoClienteRetorno);
        botaoClienteRetorno.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botaoClienteCadastro){
            Cliente cliente = new Cliente();
            arquivo.escreveArquivo("Cliente", cliente.toString());
        }
        else if(e.getSource() == botaoClienteRetorno){
            arquivo.leArquivo("Cliente");
        }

    }
}
