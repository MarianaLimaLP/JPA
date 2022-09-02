
import br.edu.ifsp.pep.dao.PessoaDAO;
import br.edu.ifsp.pep.modelo.Funcionario;
import br.edu.ifsp.pep.modelo.Pessoa;
import java.math.BigDecimal;


public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.inserir(p1);
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Maria");
        f1.setSalario(new BigDecimal(600.80));
        pessoaDAO.inserir(f1);
        
        System.out.println(pessoaDAO.getTodos());
    }
}
