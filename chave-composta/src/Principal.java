
import javax.persistence.Persistence;

public class Principal {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("chave-compostaPU").createEntityManager();
    }
}
