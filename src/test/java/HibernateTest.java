//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import ru.osipov.database.Cat;
//import ru.osipov.database.Owner;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//
//public class HibernateTest {
//    private SessionFactory sessionFactory;
//    private CatDaoFirst catDao;
//    private OwnerDaoFirst ownerDao;
//
//    @BeforeEach
//    void setUp() {
//        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//        catDao = new CatDaoFirst(sessionFactory);
//        ownerDao = new OwnerDaoFirst(sessionFactory);
//    }
//
//    @AfterEach
//    void tearDown() {
//        if (sessionFactory != null) {
//            sessionFactory.close();
//        }
//    }
//
//    @Test
//    void testSaveAndFindById() {
//        Cat cat = new Cat();
//        cat.setName("Рыжик");
//        cat.setBirthday(LocalDate.of(2022, 3, 10));
//        cat.setBreed("Мейн-кун");
//        cat.setColor("Рыжий");
//
//        Owner owner = new Owner();
//        owner.setName("Даник");
//        owner.setBirthday(LocalDate.of(2004, 6, 4));
//
//        ownerDao.save(owner);
//        catDao.save(cat);
//
//        Owner retrivedOwner = ownerDao.findById(owner.getId());
//        Cat retrivedCat = catDao.findById(cat.getId());
//
//        assertNotNull(retrivedCat);
//        assertEquals("Рыжик", retrivedCat.getName());
//
//        assertNotNull(retrivedOwner);
//        assertEquals("Даник", retrivedOwner.getName());
//    }
//
//    @Test
//    void testFindAllCats() {
//        Cat cat1 = new Cat();
//        cat1.setName("Рыжик");
//        cat1.setBirthday(LocalDate.of(2022, 3, 10));
//        cat1.setBreed("Мейн-кун");
//        cat1.setColor("Рыжий");
//
//        Cat cat2 = new Cat();
//        cat2.setName("Валера");
//        cat2.setBirthday(LocalDate.of(2021, 12, 15));
//        cat2.setBreed("Безпородистый");
//        cat2.setColor("Серый");
//
//        catDao.save(cat1);
//        catDao.save(cat2);
//
//        List<Cat> cats = catDao.findAll();
//
//        assertEquals(2, cats.size());
//    }
//}
