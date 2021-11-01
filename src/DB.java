import java.util.List;

public interface DB <T> {
    List<T> listar();
    void salvar(T obj);
}
