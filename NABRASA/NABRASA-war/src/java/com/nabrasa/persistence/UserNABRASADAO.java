package com.nabrasa.persistence;

import com.nabrasa.persistence.entities.UserNABRASA;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

/**
 *
 * @author 
 */
@LocalBean
@Stateful
public class UserNABRASADAO implements GenericDAO<UserNABRASA>{

    @PersistenceContext(unitName = "LabLP3PU", type = PersistenceContextType.EXTENDED)
    private EntityManager em;
    
    @Override
    public void create(UserNABRASA e) {
        em.persist(e);
    }

    @Override
    public List<UserNABRASA> readAll() {
        Query q = em.createQuery("select u from UserNABRASA u");
        List<UserNABRASA> lista = q.getResultList();
        return lista;
        
//        return (List<UserLP3>)em.createQuery("select u from UserLP3").getResultList();
    }

    @Override
    public UserNABRASA readById(long id) {
        return em.find(UserNABRASA.class, id);
    }

    @Override
    public void update(UserNABRASA e) {
        em.persist(e);
    }

    @Override
    public void remove(UserNABRASA e) {
        em.remove(em.merge(e));
    }
    
}
