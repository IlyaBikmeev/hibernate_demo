package org.example.dao;

import org.example.model.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.transaction.Transactional;

public class AuthorDaoImpl implements AuthorDao {
    private SessionFactory sessionFactory;

    public AuthorDaoImpl(Configuration cfg) {
        this.sessionFactory = cfg.buildSessionFactory();
    }

    @Override
    public Author getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Author author = session.get(Author.class, id);
        session.getTransaction().commit();
        return author;
    }

    @Override
    public Author getByName(String title) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void save(Author author) {

    }
}
