import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame implements ActionListener {

    private JFrame tela = new JFrame();

    JButton botaoClienteCadastro = new JButton("Cadastro cliente");
    JButton botaoClienteRetorno = new JButton("Lista de Clientes");
    JButton botaoClienteExclui = new JButton("Deletar lista de Clientes");

    JButton botaoFuncionarioCadastro = new JButton("Cadastro de funcionário");
    JButton botaoFuncionarioRetorno = new JButton("Lista de Funcionários");
    JButton botaoFuncionarioExclui = new JButton("Deletar lista de Funcionários");

    JButton botaoProdutoCadastro = new JButton("Cadastro de produto");
    JButton botaoProdutoRetorno = new JButton("Lista de Produtos");
    JButton botaoProdutoExclui = new JButton("Deletar lista de Produtos");

    static Arquivo arquivo = new Arquivo();
    static List<Cliente> listaCLientes;
    static List<Produto> listaProdutos;
    static List<Funcionario> listaFuncionarios;
    public static int sequencialCliente=0;
    public static int sequencialFuncionario=0;

    public Main(){
        criaTela();
    }

    public static void main(String[] args) {
        listaCLientes = new ArrayList<Cliente>();
        listaProdutos = new ArrayList<Produto>();
        listaFuncionarios = new ArrayList<Funcionario>();
        new Main();
    }

    public void criaTela(){
        final int WIDTH = 1080;
        final int HEIGHT = 720;

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

        tela.add(botaoClienteCadastro);
        botaoClienteCadastro.setBounds(10,10,150,50);
        botaoClienteCadastro.addActionListener(new CadastroClienteListener());

        tela.add(botaoClienteRetorno);
        botaoClienteRetorno.setBounds(170,10,150,50);
        botaoClienteRetorno.addActionListener(new ClienteRetorno());

        tela.add(botaoFuncionarioCadastro);
        botaoFuncionarioCadastro.setBounds(10,70,150,50);
        botaoFuncionarioCadastro.addActionListener(new CadastroFuncionarioListener());

        tela.add(botaoFuncionarioRetorno);
        botaoFuncionarioRetorno.setBounds( 170, 70, 150, 50);
        botaoFuncionarioRetorno.addActionListener(new FuncionarioRetorno());

        tela.add(botaoProdutoCadastro);
        botaoProdutoCadastro.setBounds(10, 130, 150, 50);
        botaoProdutoCadastro.addActionListener(new CadastroProdutoListener());

        tela.add(botaoProdutoRetorno);
        botaoProdutoRetorno.setBounds(170, 130, 150, 50);
        botaoProdutoRetorno.addActionListener(new ProdutoRetorno());

        tela.add(botaoClienteExclui);
        botaoClienteExclui.setBounds(WIDTH-230,10, 200, 50);
        botaoClienteExclui.addActionListener(new ExcluiListaCliente());

        tela.add(botaoFuncionarioExclui);
        botaoFuncionarioExclui.setBounds(WIDTH-230,70, 200, 50);
        botaoFuncionarioExclui.addActionListener(new ExcluiListaFuncionario());

        tela.add(botaoProdutoExclui);
        botaoProdutoExclui.setBounds(WIDTH-230,130, 200, 50);
        botaoProdutoExclui.addActionListener(new ExcluiListaProduto());

    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
