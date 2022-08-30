package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Venda;
import java.util.List;
import javax.persistence.TypedQuery;

public class VendaDAO extends AbstractDAO<Venda>{
    public List<Venda> buscar(){        
        TypedQuery<Venda> query = getEntityManager().createQuery("SELECT v FROM Venda v", Venda.class);
        
        return query.getResultList();
    }
    
}
