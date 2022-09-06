package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Pessoa;
import java.util.List;
import javax.persistence.TypedQuery;

public class PessoaDAO extends AbstractDAO<Pessoa>{
    public List<Pessoa> getTodos(){
        TypedQuery<Pessoa> query = getEntityManager().createQuery("SELECT p FROM Pessoa p", Pessoa.class);
        
        return query.getResultList();
    }
}
