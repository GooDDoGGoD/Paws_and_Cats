package ru.osipov.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.osipov.DAO.CatDao;
import ru.osipov.DTO.CatDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CatServiceImpl implements CatService {
    @Autowired
    private CatDao catDao;

    @Override
    public Cat getCatById(int id) {
        return catDao.findById(id);
    }

    @Override
    public List<Cat> getAllCats() {
        return catDao.findAll();
    }

    @Override
    public CatDto getCatDtoById(int id) {
        Cat cat = catDao.getById(id);
        return new CatDto(cat.getId(), cat.getName(), cat.getBirthday(), cat.getBreed(), cat.getColor());
    }

    public List<CatDto> getAllCatsDto() {
        List<Cat> cats = catDao.findAll();
        return cats.stream().map(cat -> new CatDto(cat.getId(), cat.getName(), cat.getBirthday(), cat.getBreed(), cat.getColor())).collect(Collectors.toList());
    }

    @Override
    public List<CatDto> getCatsDtoByColor(String color) {
        List<Cat> cats = catDao.findByColor(color);
        return cats.stream().map(cat -> new CatDto(cat.getId(), cat.getName(), cat.getBirthday(), cat.getBreed(), cat.getColor())).collect(Collectors.toList());
    }

    @Override
    public void addCat(Cat cat) {
        catDao.save(cat);
    }

    @Override
    public void updateCat(Cat cat) {
        catDao.save(cat);
    }

    @Override
    public void deleteCat(int id) {
        Cat cat = catDao.findById(id);
        if (cat != null) {
            catDao.delete(cat);
        }
    }
}
