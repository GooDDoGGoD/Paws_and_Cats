package ru.osipov.database;

import ru.osipov.DTO.CatDto;

import java.util.List;

public interface CatService {
    Cat getCatById(int id);
    List<Cat> getAllCats();
    CatDto getCatDtoById(int id);
    List<CatDto> getAllCatsDto();
    List<CatDto> getCatsDtoByColor(String color);
    void addCat(Cat cat);
    void updateCat(Cat cat);
    void deleteCat(int id);
}
