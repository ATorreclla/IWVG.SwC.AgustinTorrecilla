package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void before() {
        this.user = new User(2, "Rafael", "Nadal");
    }

    @Test
    void testUser() {
        assertEquals(2, this.user.getNumber());
        assertEquals("Rafael", this.user.getName());
        assertEquals("Nadal", this.user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Rafael Nadal", this.user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("R.", this.user.initials());
    }
}