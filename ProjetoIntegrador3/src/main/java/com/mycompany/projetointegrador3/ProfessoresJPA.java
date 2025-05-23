
package com.mycompany.projetointegrador3;

import jakarta.persistence.EntityManager;
import java.util.List;


public class ProfessoresJPA {
     public void cadastrar(Professores pr) {
        EntityManager em = JPAUtil.conectar();
        try {
            em.getTransaction().begin();
            em.persist(pr);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.desconectar();
        }
    }
     
    public List<Professores> listarTodos() {
    EntityManager em = JPAUtil.conectar();
    List<Professores> lista = null;
    try {
        lista = em.createQuery("SELECT p FROM Professores p", Professores.class).getResultList();
    } finally {
        JPAUtil.desconectar();
    }
    return lista;
} 
}
