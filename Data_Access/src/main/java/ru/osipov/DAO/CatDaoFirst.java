package ru.osipov.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.osipov.database.Cat;

import java.util.List;

public class CatDaoFirst implements CatDao {
    private final SessionFactory sessionFactory;

    public CatDaoFirst(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Cat findById(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Cat.class, id);
        }
    }

    @Override
    public List<Cat> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Cat", Cat.class).list();
        }
    }

    @Override
    public void save(Cat cat) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(cat);
            tx.commit();
        }
    }

    @Override
    public void update(Cat cat) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(cat);
            tx.commit();
        }
    }

    @Override
    public void delete(Cat cat) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.delete(cat);
            tx.commit();
        }
    }
}
