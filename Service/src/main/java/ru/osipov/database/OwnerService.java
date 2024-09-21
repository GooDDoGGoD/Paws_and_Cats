package ru.osipov.database;

import java.util.List;

public interface OwnerService {
    Owner getOwnerById(int id);
    List<Owner> getAllOwners();
    void createOwner(Owner owner);
    void updateOwner(Owner owner);
    void deleteOwner(int id);
}
