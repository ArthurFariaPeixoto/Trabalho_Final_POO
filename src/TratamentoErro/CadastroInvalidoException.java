package TratamentoErro;

public class CadastroInvalidoException extends RuntimeException{

    public CadastroInvalidoException(String mensagem){
        super(mensagem);
    }
}
