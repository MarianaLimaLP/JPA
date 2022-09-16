package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Van;
import java.util.List;
import javax.persistence.TypedQuery;

public class VanDAO extends AbstractDAO<Van>{
    
    public List<Van> getTodos(){
        TypedQuery<Van> query = getEntityManager().createQuery("SELECT v FROM Van v", Van.class);
        
        return query.getResultList();
    }
}
