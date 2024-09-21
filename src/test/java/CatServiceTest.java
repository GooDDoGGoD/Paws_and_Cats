import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import ru.osipov.DAO.CatDao;
import ru.osipov.database.Cat;
import ru.osipov.database.CatServiceImpl;
import ru.osipov.database.Owner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CatServiceTest {
    @Mock
    private CatDao catDao;

    @InjectMocks
    private CatServiceImpl catService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllCats() {
        List<Cat> mockCats = List.of(new Cat(), new Cat());
        Mockito.when(catDao.findAll()).thenReturn(mockCats);

        List<Cat> cats = catService.getAllCats();

        assertEquals(2, cats.size());
        Mockito.verify(catDao, Mockito.times(1)).findAll();
    }

    @Test
    void testGerCastsByOwner() {
        Owner owner = new Owner();
        List<Cat> mockCats = List.of(new Cat(), new Cat());
        owner.setCats(mockCats);

        Mockito.when(catDao.findAll()).thenReturn(mockCats);

        List<Cat> cats = catService.getAllCats();

        assertEquals(2, cats.size());
        Mockito.verify(catDao, Mockito.times(1)).findAll();
    }
}
