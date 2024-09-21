import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import ru.osipov.DAO.OwnerDao;
import ru.osipov.database.Owner;
import ru.osipov.database.OwnerSeviceImpl;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OwnerServiceTest {
    @Mock
    private OwnerDao ownerDao;

    @InjectMocks
    private OwnerSeviceImpl ownerService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllOwners() {
        List<Owner> mockOwners = List.of(new Owner(), new Owner(), new Owner());
        Mockito.when(ownerDao.findAll()).thenReturn(mockOwners);

        List<Owner> owners = ownerService.getAllOwners();

        assertEquals(3, owners.size());
        Mockito.verify(ownerDao, Mockito.times(1)).findAll();
    }

    @Test
    public void testGetOwnerCats() {
        Owner owner = new Owner();
        List<Owner> mockOwners = List.of(owner);
        Mockito.when(ownerDao.findAll()).thenReturn(mockOwners);

        List<Owner> owners = ownerService.getAllOwners();
        assertEquals(1, owners.size());
        assertEquals(owner.getCats().size(), 0);
        Mockito.verify(ownerDao, Mockito.times(1)).findAll();
    }
}
