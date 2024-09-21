package ru.osipov.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.osipov.database.Owner;

import java.util.List;

@Repository
public interface OwnerDao extends JpaRepository<Owner, Integer> {
    Owner findById(int id);
    List<Owner> findAll();
}
