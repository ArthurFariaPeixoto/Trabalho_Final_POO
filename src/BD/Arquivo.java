package BD;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Classe responsavel pelo tratamento de arquivos.
 */
public class Arquivo{

    /**
     * Metodo que cria o arquivo desejado caso ele nao exista.
     * @since 1.0.0
     * @param tipo String
     */
    public void criaArquivo(String tipo){
        Path diretorio = Paths.get(tipo+".txt");

        try {
            Files.createFile(diretorio);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo que preenche o arquivo desejado com as informações digitadas.
     * @param tipo String
     * @param conteudo String
     */
    public void escreveArquivo(String tipo, String conteudo){
        Path diretorio = Paths.get(tipo+".txt");
        byte[] escrita_emBytes = conteudo.getBytes();

        try {
            Files.write(diretorio,escrita_emBytes, StandardOpenOption.APPEND);
        } catch (IOException e) {
            criaArquivo(tipo);
            escreveArquivo(tipo, conteudo);
        }

    }

    /**
     * Metodo que imprime o arquivo na tela para a leitura.
     * @param tipo String
     */
    public void leArquivo(String tipo){
        Path diretorio = Paths.get(tipo+".txt");


        try {
            byte[] conteudo = Files.readAllBytes(diretorio);
            String leitura = new String(conteudo);
            JOptionPane.showMessageDialog(null, leitura);
        }
        catch (IOException e) {
            criaArquivo(tipo);
            leArquivo(tipo);
        }
    }

    /**
     * Metodo que exclui o arquivo inteiro.
     * @param tipo String
     */
    public void deletaArquivo(String tipo){
        Path diretorio = Paths.get(tipo+".txt");

        try {
            Files.delete(diretorio);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
