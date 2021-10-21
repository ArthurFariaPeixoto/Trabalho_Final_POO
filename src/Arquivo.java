import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Arquivo {

    public void criaArquivo(String tipo){
        Path diretorio = Paths.get(tipo+".txt");

        try {
            Files.createFile(diretorio);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escreveArquivo(String tipo, String conteudo){
        Path diretorio = Paths.get(tipo+".txt");
        byte[] escrita_emBytes = conteudo.getBytes();

        try {
            Files.write(diretorio,escrita_emBytes, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void leArquivo(String tipo){
        Path diretorio = Paths.get(tipo+".txt");

        try {
            byte[] conteudo = Files.readAllBytes(diretorio);
            String leitura = new String(conteudo);
            JOptionPane.showMessageDialog(null, leitura.split("]"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void deletaArquivo(String tipo){
        Path diretorio = Paths.get(tipo+".txt");

        try {
            Files.delete(diretorio);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
