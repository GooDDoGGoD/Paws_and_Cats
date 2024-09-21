package ru.osipov.DAO;

import ru.osipov.database.Owner;

import java.util.List;

public interface OwnerDao {
    Owner findById(int id);
    List<Owner> findAll();
    void save(Owner owner);
    void update(Owner owner);
    void delete(Owner owner);
}
