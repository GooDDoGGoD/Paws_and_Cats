package ru.osipov.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.osipov.database.Cat;

import java.util.List;

@Repository
public interface CatDao extends JpaRepository<Cat, Integer> {
    Cat findById(int id);
    List<Cat> findAll();
    List<Cat> findByColor(String color);
}
