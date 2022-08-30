package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Produto;
import java.util.List;
import javax.persistence.TypedQuery;

public class ProdutoDAO extends AbstractDAO<Produto>{
    public List<Produto> buscar(){
        TypedQuery<Produto> query = getEntityManager().createQuery("SELECT p FROM Produto p", Produto.class);
        
        return query.getResultList();
    }
    
}
