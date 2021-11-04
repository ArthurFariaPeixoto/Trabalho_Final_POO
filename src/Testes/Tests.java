package Testes;

import Pessoas.clientes.Cliente;
import Pessoas.funcionarios.Funcionario;
import Produtos.Produto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Classe de testes usando o JUnit.
 */
public class Tests {
    /**
     * Metodo que confere se a logica por tras do calculo de salarios dos funcionarios esta correta.
     */
    @Test
    public void salariototalFuncionario() {

        Funcionario fun = new Funcionario(0, "teste", "10/10/1990", 40, 21, 1000);
        Double expected = 1002.1;
        Double atual = fun.getSalario();
        assertEquals(expected, atual);
    }

    /**
     * Metodo que confere se a logica por tras do calculo de rendimento do funcionario esta correta.
     */
    @Test
    public void rendimentoFuncionario(){
        Funcionario fun = new Funcionario(0, "teste", "10/10/1990", 40, 21, 1000);
        String expected = fun.rendimentoFuncionario();
        assertEquals("Excelente", expected);
    }

    /**
     * Metodo que confere se pode ser criado um funcionario com valores invalidos.
     */
    @Test
    public void funcionarioInvalido(){
        Funcionario fun = new Funcionario(0, "", "", 0, 0, 0);
        if (fun.getNome() == null || fun.getNome().equals(" ") || fun.getSalario() == 0 || fun.getVendas() == 0 || fun.getHoras_semanais() == 0 || fun.getDataNascimento() == null || fun.getDataNascimento().equals(" ")) {
            String expected = " ".trim();
            assertEquals(expected, fun.getNome().trim());
        }
    }

    /**
     * Metodo que confere se pode ser criado um cliente com valores invalidos.
     */
    @Test
    public void clienteInvalido(){
        Cliente cliente = new Cliente(0,"", "", "");
        if(cliente.getNome().length() == 0 || cliente.getCpf().length() != 11|| cliente.getDataNascimento().length() == 0){
            String expected = "";
            assertEquals(expected, cliente.getNome().trim());
        }
    }

    /**
     * Metodo que confere se pode ser criado um produto com valores invalidos.
     */
    @Test
    public void produtoInvalido(){
        Produto produto = new Produto("","", 0, 0, 0, 0);
        if(produto.getNome().length() == 0 || produto.getCodigo().length() == 0|| produto.getQuantidade()== 0){
            String expected = "";
            assertEquals(expected, produto.getNome().trim());
        }
    }

    /**
     * Metodo que confere se a logica por tras do calculo de desconto do produto esta certa.
     */
    @Test
    public void descontoDoProduto(){
        Produto produto = new Produto("teste", "teste", 50, 50, 4, 0);
        Double expected = produto.getPreco()-produto.getDesconto();
        Double atual = produto.getPrecoDesconto();
        assertEquals(expected, atual);
    }
}
