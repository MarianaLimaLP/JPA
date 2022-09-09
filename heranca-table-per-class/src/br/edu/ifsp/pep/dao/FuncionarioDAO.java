package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.dao.AbstractDAO;
import br.edu.ifsp.pep.modelo.Funcionario;
import java.util.List;
import javax.persistence.TypedQuery;

public class FuncionarioDAO extends AbstractDAO<Funcionario>{
    public List<Funcionario> getTodos(){
        TypedQuery<Funcionario> query = getEntityManager().createQuery("SELECT f FROM Funcionario f", Funcionario.class);
        
        return query.getResultList();
    }
}
