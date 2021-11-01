import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ArquivoDB <T> implements DB <T> {

    private final String tipo;
    private final Integer id;

    public ArquivoDB(String tipo) {
        this.tipo = tipo;
        this.id = null;//TODO Ler do arquivos
    }

    public void criaArquivo(){
        Path diretorio = Paths.get(tipo+".txt");

        try {
            Files.createFile(diretorio);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void salvar(T conteudo){
        Path diretorio = Paths.get(tipo+".txt");
        byte[] escrita_emBytes = (conteudo.toString() + "\n").getBytes();

        try {
            Files.write(diretorio,escrita_emBytes, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public List<T> listar(){
        Path diretorio = Paths.get(tipo+".txt");

        try {
            byte[] conteudo = Files.readAllBytes(diretorio);
            String leitura = new String(conteudo);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void deletaArquivo(){
        Path diretorio = Paths.get(tipo+".txt");

        try {
            Files.delete(diretorio);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
