
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Cliente;
import java.util.List;
import javax.persistence.TypedQuery;

public class ClienteDAO extends AbstractDAO<Cliente>{
    public List<Cliente> getTodos(){
        TypedQuery<Cliente> query = getEntityManager().createQuery("SELECT c FROM Cliente c", Cliente.class);
        
        return query.getResultList();
    }
}
