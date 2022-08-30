package br.edu.ifsp.pep.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDAO<T> {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("novo30-08PU");

    protected EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void inserir(T entity){
        EntityManager em = getEntityManager();
        
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        
        em.close();
    }
    
    public void alterar(T entity){
        EntityManager em = getEntityManager();
        
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
        
        em.close();
    }
    
    
}
