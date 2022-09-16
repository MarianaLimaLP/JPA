package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Veiculo;
import java.util.List;
import javax.persistence.TypedQuery;

public class VeiculoDAO extends AbstractDAO<Veiculo>{
    public List<Veiculo> getTodos(){
        TypedQuery<Veiculo> query = getEntityManager().createQuery("SELECT v FROM Veiculo v", Veiculo.class);
        
        return query.getResultList();
    }
    
    public List<Veiculo> getDisponiveisParaAlocacao(){
        TypedQuery<Veiculo> query = getEntityManager().createQuery("SELECT v FROM Veiculo v WHERE v.cliente = null", Veiculo.class);
        
        return query.getResultList();
    }
    
}
