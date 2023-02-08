package org.example;

import org.example.dao.AuthorDao;
import org.example.dao.AuthorDaoImpl;
import org.example.model.Author;
import org.example.model.Book;
import org.example.model.Genre;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */

public class App {
    public static void main( String[] args ) {
        Configuration cfg = new Configuration()
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Genre.class);

        AuthorDao authorDao = new AuthorDaoImpl(cfg);
        System.out.println(authorDao.getById(2).getName());
    }
}
