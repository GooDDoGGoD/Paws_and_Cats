package ru.osipov.database;

import java.util.List;

public interface CatService {
    Cat getCatById(int id);
    List<Cat> getAllCats();
    void addCat(Cat cat);
    void updateCat(Cat cat);
    void deleteCat(int id);
}
