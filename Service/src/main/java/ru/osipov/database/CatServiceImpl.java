package ru.osipov.database;

import org.springframework.stereotype.Service;
import ru.osipov.DAO.CatDao;

import java.util.List;

@Service
public class CatServiceImpl implements CatService {
    private final CatDao catDao;

    public CatServiceImpl(CatDao catDao) {
        this.catDao = catDao;
    }

    @Override
    public Cat getCatById(int id) {
        return catDao.findById(id);
    }

    @Override
    public List<Cat> getAllCats() {
        return catDao.findAll();
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
