package Testes;

import Pessoas.funcionarios.Funcionario;
import Produtos.Produto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void salariototalFuncionario() {

        Funcionario fun = new Funcionario(0, "teste", "10/10/1990", 40, 21, 1000);
        Double expected = 1002.1;
        Double atual = fun.getSalario();
        assertEquals(expected, atual);
    }
    @Test
    public void rendimentoFuncionario(){
        Funcionario fun = new Funcionario(0, "teste", "10/10/1990", 40, 21, 1000);
        String expected = fun.rendimentoFuncionario();
        assertEquals("Excelente", expected);
    }
    @Test
    public void erroNoCadastroCliente(){
        Funcionario fun = new Funcionario(0, "", "", 0, 0, 0);
        if (fun.getNome() == null || fun.getNome().equals(" ") || fun.getSalario() == 0 || fun.getVendas() == 0 || fun.getHoras_semanais() == 0 || fun.getDataNascimento() == null || fun.getDataNascimento().equals(" ")) {
            String expected = " ".trim();
            assertEquals(expected, fun.getNome().trim());
        }
    }
    @Test
    public void descontoDoProduto(){
        Produto produto = new Produto("teste", "teste", 50, 50, 4, 0);
        Double expected = produto.getPreco()-produto.getDesconto();
        Double atual = produto.getPrecoDesconto();
        assertEquals(expected, atual);
    }

}
