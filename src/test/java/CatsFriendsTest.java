import org.junit.jupiter.api.Test;
import ru.osipov.database.Cat;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CatsFriendsTest {
    @Test
    public void testAddFriends() {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.addFriend(cat2);

        assertTrue(cat1.getFriends().contains(cat2));
        assertTrue(cat2.getFriends().contains(cat1));
    }

    @Test
    void testRemoveFriend() {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.addFriend(cat2);
        assertTrue(cat1.getFriends().contains(cat2));
        assertTrue(cat2.getFriends().contains(cat1));

        cat1.removeFriend(cat2);

        assertFalse(cat1.getFriends().contains(cat2));
        assertFalse(cat2.getFriends().contains(cat1));
    }

    @Test
    void testMutualFriendship() {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cat1.addFriend(cat2);

        assertTrue(cat1.getFriends().contains(cat2));
        assertTrue(cat2.getFriends().contains(cat1));

        assertFalse(cat1.getFriends().contains(cat3));
        assertFalse(cat2.getFriends().contains(cat3));
    }
}
