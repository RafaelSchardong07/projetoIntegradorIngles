
package com.mycompany.projetointegrador3;

import jakarta.persistence.EntityManager;
import java.util.List;


public class TurmaJPA {
    
     public void cadastrar(Turmas t) {
        EntityManager em = JPAUtil.conectar();
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.desconectar();
        }
    }
     
      public List<Turmas> listarTodos() {
    EntityManager em = JPAUtil.conectar();
    List<Turmas> lista = null;
    try {
        lista = em.createQuery("SELECT t FROM Turmas t", Turmas.class).getResultList();
    } finally {
        JPAUtil.desconectar();
    }
    return lista;
}
       
   }

