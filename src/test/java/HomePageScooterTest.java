import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class HomePageScooterTest {
    private WebDriver driver;

    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final String comment;


    public HomePageScooterTest (String name, String surname, String address, String phone, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.comment = comment;

    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {"Марина", "Иванова", "г. Москва, ул. Профсоюзная, д. 100", "71471471471", "Очень жду"},
                {"Пчелка", "Полосатая", "г. Москва, ул. Сотовая, д.1", "71591591591", "Привозите как можно скорее"},

        };
    }

    @Test
    public void successfulScooterOrder () {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooter objHomePageScooter = new HomePageScooter(driver);
        objHomePageScooter.orderButtonClick();

        objHomePageScooter.fillInPersonalForm(name, surname, address, phone);
        objHomePageScooter.fillInRentForm(comment);
        objHomePageScooter.orderScooterButtonClick();

        boolean isNotHidden = objHomePageScooter.findOrderPopup();

        assertTrue(isNotHidden);

    }

    @Test
    public void succsessfulSecondScooterOrder () {
        driver = new ChromeDriver();
       //driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooter objHomePageScooter = new HomePageScooter(driver);

        objHomePageScooter.orderSecondButtonClick();

        objHomePageScooter.fillInPersonalForm(name, surname, address, phone);
        objHomePageScooter.fillInRentForm(comment);
        objHomePageScooter.orderScooterButtonClick();

        boolean isNotHiddenSecond = objHomePageScooter.findOrderPopup();

        assertTrue(isNotHiddenSecond);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}