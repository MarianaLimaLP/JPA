package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Moto;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class MotoDAO extends AbstractDAO<Moto>{
    
    public List<Moto> getTodos(){
        TypedQuery<Moto> query = getEntityManager().createQuery("SELECT m FROM Moto m", Moto.class);
        
        return query.getResultList();
    }
    
    
}
