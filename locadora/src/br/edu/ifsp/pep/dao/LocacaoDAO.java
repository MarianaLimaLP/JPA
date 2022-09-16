package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Locacao;
import java.util.List;
import javax.persistence.TypedQuery;

public class LocacaoDAO extends AbstractDAO<Locacao>{
    public List<Locacao> getTodos(){
        TypedQuery<Locacao> query = getEntityManager().createQuery("SELECT l FROM Locacao l", Locacao.class);
        
        return query.getResultList();
    }
}
