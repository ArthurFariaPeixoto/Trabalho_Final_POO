import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame implements ActionListener {

    private JFrame tela = new JFrame();
    private final int WIDTH = 1080, HEIGHT = 720;

    JButton botaoClienteCadastro = new JButton("Cadastro cliente");
    JButton botaoClienteRetorno = new JButton("Lista de Clientes");

    JButton botaoFuncionarioCadastro = new JButton("Cadastro de funcionário");
    JButton botaoFuncionarioRetorno = new JButton("Lista de Funcionários");

    static Arquivo arquivo = new Arquivo();
    static List<Cliente> listaCLientes;
    static List<Produto> listaProdutos;
    static List<Funcionario> listaFuncionarios ;


    public Main(){
        criaTela();
    }


    public static void main(String[] args) {
        listaCLientes = new ArrayList<Cliente>();
        listaProdutos = new ArrayList<Produto>();
        listaFuncionarios = new ArrayList<Funcionario>();
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

        botaoClienteRetorno.setBounds(170,10,150,50);
        tela.add(botaoClienteRetorno);
        botaoClienteRetorno.addActionListener(this);

        botaoFuncionarioCadastro.setBounds(10,70,150,50);
        tela.add(botaoFuncionarioCadastro);
        botaoFuncionarioCadastro.addActionListener(this);

        botaoFuncionarioRetorno.setBounds( 170, 70, 150, 50);
        tela.add(botaoFuncionarioRetorno);
        botaoFuncionarioRetorno.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botaoClienteCadastro){
            Cliente cliente = new Cliente();
            listaCLientes.add(cliente);
            arquivo.escreveArquivo("Cliente", listaCLientes.toString());
        }
        if(e.getSource() == botaoClienteRetorno){
            arquivo.leArquivo("Cliente");
        }
        if(e.getSource() == botaoFuncionarioCadastro){
            Funcionario funcionario = new Funcionario();
            listaFuncionarios.add(funcionario);
            arquivo.escreveArquivo("Funcionario", listaFuncionarios.toString());
        }
        if(e.getSource() == botaoFuncionarioRetorno){
            arquivo.leArquivo("Funcionario");
        }

    }
}
