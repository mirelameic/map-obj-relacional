package com.museubd.model.repository;



import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class Repository {


    private final EntityManager session;

    public Repository() {
        this.session = Persistence
                .createEntityManagerFactory("museubd")
                .createEntityManager();
    }

    public void save(Object entity) {
        try {
            session.getTransaction().begin();
            session.persist(entity);
            session.getTransaction().commit();
        } catch (Exception exception) {
            session.getTransaction().rollback();
        }
    }

    public void delete(Object entity) {
        try {
            session.getTransaction().begin();
            session.remove(entity);
            session.getTransaction().commit();
        } catch (Exception exception) {
            session.getTransaction().rollback();
        }
    }

    public Object find(Class clazz, Integer id) {
        return session.find(clazz, id);
    }

    public Object find(Class clazz, String id) {
        return session.find(clazz, id);
    }

    public List findAll(Class clazz) {
        String query = String.format("from %s", clazz.getSimpleName());
        System.out.println(query);
        return session.createQuery(query, clazz).getResultList();
    }

}