package ru.osipov.DAO;

import ru.osipov.database.Cat;

import java.util.List;

public interface CatDao {
    Cat findById(int id);
    List<Cat> findAll();
    void save(Cat cat);
    void update(Cat cat);
    void delete(Cat cat);
}
