package ru.osipov.database;

import org.springframework.stereotype.Service;
import ru.osipov.DAO.OwnerDao;

import java.util.List;

@Service
public class OwnerSeviceImpl implements OwnerService{
    private final OwnerDao ownerDao;

    public OwnerSeviceImpl(OwnerDao ownerDao) {
        this.ownerDao = ownerDao;
    }

    @Override
    public Owner getOwnerById(int id) {
        return ownerDao.findById(id);
    }

    @Override
    public List<Owner> getAllOwners() {
        return ownerDao.findAll();
    }

    @Override
    public void createOwner(Owner owner) {
        ownerDao.save(owner);
    }

    @Override
    public void updateOwner(Owner owner) {
        ownerDao.save(owner);
    }

    @Override
    public void deleteOwner(int id) {
        Owner owner = ownerDao.findById(id);
        if (owner != null) {
            ownerDao.delete(owner);
        }
    }
}
