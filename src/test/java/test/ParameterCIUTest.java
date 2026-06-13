/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test;

/**
 *
 * @author Vasquez Emmanuel
 */
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.*;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParameterCIUTest {

    private String email;
    private boolean expected;

    public ParameterCIUTest(String email, boolean expected) {
        this.email = email;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][]{
                {"test@mail.com", true},
                {"badmail", false},
                {"user@domain", false},
                {"ok@ok.com", true}
        });
    }

    @Test
    public void testValidarEmail() {
        assertEquals(expected, validarMail(email));
    }

    public static boolean validarMail(String email) {
        Pattern pattern = Pattern.compile(
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
        );
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
}