package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Vasquez Emmanuel
 */
import com.mycompany.examen2ing.Ciudadano;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CiudadanoTest {

    Ciudadano usr;

    @BeforeAll
    void init() {
        usr = new Ciudadano("Anonimus", "a@a.com", "1212");
    }

    // 5. Debe FALLAR
    @Test
    void testValidarUsr() {
        assertTrue(usr.validarIngreso("123456"));
    }

    // 6. Debe tener ÉXITO
    @Test
    void testValidarEmail() {
        String email = "test@mail.com";

        boolean valido = email.contains("@")
                && email.contains(".")
                && email.length() < 20;

        assertTrue(valido);
    }

    // 7. Debe ÉXITO
    @Test
    void testCambioPass() {
        usr.cambioPassword("1234");
        assertEquals("1234", usr.getPassword());
    }

    // 8. TIMEOUT FAIL
    @Test
    @Timeout(30)
    void testDelay() throws InterruptedException {
        usr.delay(45);
    }

    // 9. Debe ÉXITO
    @Test
    void testCiudadanosDiferentes() {
        Ciudadano c1 = new Ciudadano("A", "a@a.com", "1");
        Ciudadano c2 = new Ciudadano("B", "b@b.com", "2");

        assertNotSame(c1, c2);
    }
}