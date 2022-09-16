
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Carro;
import java.util.List;
import javax.persistence.TypedQuery;

public class CarroDAO extends AbstractDAO<Carro>{
    
    public List<Carro> getTodos(){
        TypedQuery<Carro> query = getEntityManager().createQuery("SELECT c FROM Carro c", Carro.class);
        
        return query.getResultList();
    }
}
