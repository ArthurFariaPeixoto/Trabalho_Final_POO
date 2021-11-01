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

    JButton botaoFuncionarioCadastro = new JButton("Cadastro de funcionário");
    JButton botaoFuncionarioRetorno = new JButton("Lista de Funcionários");

    JButton botaoProdutoCadastro = new JButton("Cadastro de produto");
    JButton botaoProdutoRetorno = new JButton("Lista de Produtos");

    static Arquivo arquivo = new Arquivo();

    static DB<Cliente> arquivoClientes = new ArquivoDB<>("Cliente");
    static DB<Funcionario> arquivoFuncionarios = new ArquivoDB<>("Funcionario");
    static DB<Produto> arquivoProdutos = new ArquivoDB<>("Produto");

    static Integer idSequencialCliente = 0; //TODO ler na abertura do programa
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
        botaoClienteCadastro.addActionListener(new ClienteListener());

        tela.add(botaoClienteRetorno);
        botaoClienteRetorno.setBounds(170,10,150,50);
        botaoClienteRetorno.addActionListener(this);

        tela.add(botaoFuncionarioCadastro);
        botaoFuncionarioCadastro.setBounds(10,70,150,50);
        botaoFuncionarioCadastro.addActionListener(this);

        tela.add(botaoFuncionarioRetorno);
        botaoFuncionarioRetorno.setBounds( 170, 70, 150, 50);
        botaoFuncionarioRetorno.addActionListener(this);

        tela.add(botaoProdutoCadastro);
        botaoProdutoCadastro.setBounds(10, 130, 150, 50);
        botaoProdutoCadastro.addActionListener(this);

        tela.add(botaoProdutoRetorno);
        botaoProdutoRetorno.setBounds(170, 130, 150, 50);
        botaoProdutoRetorno.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botaoFuncionarioCadastro){
            Funcionario funcionario = new Funcionario();
            listaFuncionarios.add(funcionario);
            arquivo.escreveArquivo("Funcionario", funcionario.toString());
        }
        if(e.getSource() == botaoClienteCadastro){
            String nomeCompleto = JOptionPane.showInputDialog("Nome Completo");
            String cpf = JOptionPane.showInputDialog("CPF");
            String dataDeNascimento = JOptionPane.showInputDialog("Data de nascimento");

            if (!isEmpty(nomeCompleto) && !isEmpty(cpf) && !isEmpty(dataDeNascimento)) {
                Cliente cliente = new Cliente(++idSequencialCliente, nomeCompleto, cpf, dataDeNascimento);
                listaCLientes.add(cliente);
                arquivo.escreveArquivo("Cliente", cliente.toString() + "\n");

                arquivoClientes.salvar(cliente);
            }
        }
        if(e.getSource() == botaoProdutoCadastro){
            Produto produto = new Produto();
            listaProdutos.add(produto);
            arquivo.escreveArquivo("Produto", produto.toString());
        }
        if(e.getSource() == botaoClienteRetorno){
            arquivo.leArquivo("Cliente");
        }
        if(e.getSource() == botaoFuncionarioRetorno){
            arquivo.leArquivo("Funcionario");
        }
        if(e.getSource() == botaoProdutoRetorno){
            arquivo.leArquivo("Produto");
        }

        TipoProduto tipo = TipoProduto.MIP;
    }

    private static boolean isEmpty(String string) {
        return string == null || string.trim().isEmpty();
    }
}
