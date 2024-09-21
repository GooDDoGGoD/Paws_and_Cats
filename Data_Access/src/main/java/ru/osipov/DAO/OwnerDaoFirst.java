package ru.osipov.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.osipov.database.Owner;

import java.util.List;

public class OwnerDaoFirst implements OwnerDao {
    private final SessionFactory sessionFactory;
    public OwnerDaoFirst(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Owner findById(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Owner.class, id);
        }
    }

    @Override
    public List<Owner> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Owner", Owner.class).list();
        }
    }

    @Override
    public void save(Owner owner) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(owner);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Owner owner) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(owner);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Owner owner) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(owner);
            session.getTransaction().commit();
        }
    }
}
