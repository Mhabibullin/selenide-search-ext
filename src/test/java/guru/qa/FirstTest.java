package guru.qa;

import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    static void BeforeAllah() {
        System.out.println("this is before all method");

    }

    @BeforeEach
    void setUp() {
        System.out.println("this is before each method!");

    }

    @AfterEach
    void tearDown() {
        System.out.println("this is after each method");

    }


    @Test
    void firstTest () {
        System.out.println("This is a first test");
        Assertions.assertTrue(true);

    }

    @Test
    void secondTest () {
        System.out.println("This is a second test");
        Assertions.assertTrue(true);

    }

}
