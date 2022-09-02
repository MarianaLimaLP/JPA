package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Item;
import br.edu.ifsp.pep.modelo.Venda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class VendaDAO extends AbstractDAO<Venda> {

    public List<Venda> getTodos() {
        TypedQuery<Venda> query = getEntityManager().createQuery("SELECT v FROM Venda v", Venda.class);

        return query.getResultList();
    }
    
    /*
    @Override
    public void inserir(Venda venda) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(venda);

        for (Item item : venda.getItens()) {
            em.persist(item);
        }

        em.getTransaction().commit();
        em.close();
    }*/
}
