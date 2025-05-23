
package com.mycompany.projetointegrador3;

import jakarta.persistence.EntityManager;
import java.util.List;

public class AlunosJPA {
     public void cadastrar(Alunos al) {
        EntityManager em = JPAUtil.conectar();
        try {
            em.getTransaction().begin();
            em.persist(al);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.desconectar();
        }
    }
     
    public List<Alunos> listarTodos() {
    EntityManager em = JPAUtil.conectar();
    List<Alunos> lista = null;
    try {
        lista = em.createQuery("SELECT a FROM Alunos a", Alunos.class).getResultList();
    } finally {
        JPAUtil.desconectar();
    }
    return lista;
}
    public Alunos buscarPorId(int id) {
    EntityManager em = JPAUtil.conectar();
    try {
        return em.find(Alunos.class, id);
    } finally {
        em.close();
    }
}
    public void atualizar(Alunos aluno) {
    EntityManager em = JPAUtil.conectar();
    try {
        em.getTransaction().begin();
        em.merge(aluno);  
        em.getTransaction().commit();
    } catch (Exception e) {
        em.getTransaction().rollback();
        throw e;
    } finally {
        JPAUtil.desconectar();
    }
}
}
