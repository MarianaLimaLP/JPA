package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.TipoVeiculo;
import java.util.List;

public class TipoVeiculoDAO extends AbstractDAO<TipoVeiculo>{
    
    public List<TipoVeiculo> buscarTodos() {
        return getEntityManager().createNamedQuery("TipoVeiculo.buscarTodos", TipoVeiculo.class).getResultList();
    }
    
    public List<TipoVeiculo> findByNome(String nome) {
        return getEntityManager().createNamedQuery("TipoVeiculo.findByNome", TipoVeiculo.class).setParameter("nome", "%"+nome+"%").getResultList();
    }
    
}
