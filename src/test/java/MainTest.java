import org.example.models.DeluxeBurger;
import org.example.models.Hamburger;
import org.example.models.HealthyBurger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.reflect.Field;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {
    Hamburger hamburger;
    HealthyBurger healthyBurger;
    DeluxeBurger deluxeBurger;

    @BeforeEach
    void setUp() {
        hamburger = new Hamburger("Basic", "NORMAL", 4, "WRAP");
        healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich");
        deluxeBurger = new DeluxeBurger();
    }

    @DisplayName("Hamburger sınıfı doğru Access Modifierlara sahip mi")
    @Test
    public void testHamburgerAccessModifiers() throws NoSuchFieldException {
        Field nameField = hamburger.getClass().getDeclaredField("name");
        Field meatField = hamburger.getClass().getDeclaredField("meat");
        Field priceField = hamburger.getClass().getDeclaredField("price");

        Field addition1NameField = hamburger.getClass().getDeclaredField("addition1Name");
        Field addition1PriceField = hamburger.getClass().getDeclaredField("addition1Price");

        Field addition2NameField = hamburger.getClass().getDeclaredField("addition2Name");
        Field addition2PriceField = hamburger.getClass().getDeclaredField("addition2Price");

        Field addition3NameField = hamburger.getClass().getDeclaredField("addition3Name");
        Field addition3PriceField = hamburger.getClass().getDeclaredField("addition3Price");

        Field addition4NameField = hamburger.getClass().getDeclaredField("addition4Name");
        Field addition4PriceField = hamburger.getClass().getDeclaredField("addition4Price");

        assertEquals(2, nameField.getModifiers());
        assertEquals(2, meatField.getModifiers());
        assertEquals(2, priceField.getModifiers());

        assertEquals(2, addition1NameField.getModifiers());
        assertEquals(2, addition1PriceField.getModifiers());

        assertEquals(2, addition2NameField.getModifiers());
        assertEquals(2, addition2PriceField.getModifiers());

        assertEquals(2, addition3NameField.getModifiers());
        assertEquals(2, addition3PriceField.getModifiers());

        assertEquals(2, addition4NameField.getModifiers());
        assertEquals(2, addition4PriceField.getModifiers());
    }


    @DisplayName("Hamburger sınıfı doğru type değerlere sahip mi")
    @Test
    public void testHamburgerInstanceTypes() {
        assertThat(hamburger.getName(), instanceOf(String.class));
        assertThat(hamburger.getMeat(), instanceOf(String.class));
        assertThat(hamburger.getPrice(), instanceOf(Double.class));
        assertThat(hamburger.getBreadRollType(), instanceOf(String.class));
    }

    @DisplayName("Hamburger sınıfı addAddition methodları doğru çalışıyor mu?")
    @Test
    public void testHamburgerAddAdditionMethods() {
        hamburger.addHamburgerAddition1("test", 3);
        hamburger.addHamburgerAddition2("test", 3);
        hamburger.addHamburgerAddition3("test", 3);
        hamburger.itemizeHamburger();
        assertEquals(4, hamburger.getPrice());

    }

    @DisplayName("Deluxe Burger sınıf değişkenleri doğru değerlere sahip mi?")
    @Test
    public void testDeluxeBurgerInstanceVariables() {
        assertEquals("Curvy", deluxeBurger.getChips());
        assertEquals("Coke", deluxeBurger.getDrink());
    }

    @DisplayName("Deluxe Burger sınıfı addAddition methodları doğru çalışıyor mu?")
    @Test
    public void testDeluxeBurgerAddAdditionMethods() {
        deluxeBurger.addHamburgerAddition1("test", 3);
        deluxeBurger.addHamburgerAddition2("test", 3);
        deluxeBurger.addHamburgerAddition3("test", 3);
        deluxeBurger.itemizeHamburger();
        assertEquals(19.10, deluxeBurger.getPrice());
    }

    @DisplayName("Healthy Burger sınıf değişkenleri doğru değerlere sahip mi?")
    @Test
    public void testHealthyBurgerInstanceVariables() {
        assertEquals("Tofu", healthyBurger.getMeat());
    }

    @DisplayName("Healthy Burger sınıfı addAddition methodları doğru çalışıyor mu?")
    @Test
    public void testHealthyBurgerAddAdditionMethods() {
        healthyBurger.addHealthyAddition1("test", 2);
        healthyBurger.addHealthyAddition2("test", 2);
        healthyBurger.itemizeHamburger();
        assertEquals(5.67, healthyBurger.getPrice());
    }

}
