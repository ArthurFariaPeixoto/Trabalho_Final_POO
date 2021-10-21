import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    private JFrame tela = new JFrame();
    private final int WIDTH = 1080, HEIGHT = 720;

    JButton botaoClienteCadastro = new JButton("Cadastro cliente");
    JButton botaoFuncionario = new JButton("Funcionario");
    JButton botaoClienteRetorno = new JButton("Lista de Clientes");

    Arquivo arquivo = new Arquivo();


    public Main(){
        criaTela();
    }


    public static void main(String[] args) {
        Main main = new Main();
    }


    public void criaTela(){
        setLayout(null);

        tela.setSize(WIDTH, HEIGHT);
        tela.setTitle("Gerenciamento de Farmácia");
        tela.setVisible(true);
        tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tela.setFocusable(true);
        tela.requestFocus();
        tela.setLocationRelativeTo(null);
        tela.setResizable(false);
        tela.getContentPane().setBackground(Color.BLACK);

        botaoClienteCadastro.setBounds(10,10,150,50);
        tela.add(botaoClienteCadastro);
        botaoClienteCadastro.addActionListener(this);

        botaoFuncionario.setBounds(10,70,150,50);
        tela.add(botaoFuncionario);
        botaoFuncionario.addActionListener(this);

        botaoClienteRetorno.setBounds(170,10,150,50);
        tela.add(botaoClienteRetorno);
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
