import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class QuestionsBlockTest {
    private WebDriver driver;

    @Test
    public void firstAnswerBlockOpened () {
//
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        QuestionsBlock objQuestionsBlock = new QuestionsBlock(driver);

        boolean isNotHidden = objQuestionsBlock.firstAnswerFound();

        assertTrue(isNotHidden);
    }

    @Test
    public void secondAnswerBlockOpened () {
//
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        QuestionsBlock objQuestionsBlock = new QuestionsBlock(driver);

        boolean isNotHidden = objQuestionsBlock.secondAnswerFound();

        assertTrue(isNotHidden);
    }

    @Test
    public void thirdAnswerBlockOpened () {
//
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        QuestionsBlock objQuestionsBlock = new QuestionsBlock(driver);

        boolean isNotHidden = objQuestionsBlock.thirdAnswerFound();

        assertTrue(isNotHidden);
    }

    @Test
    public void fourthAnswerBlockOpened () {
//
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        QuestionsBlock objQuestionsBlock = new QuestionsBlock(driver);

        boolean isNotHidden = objQuestionsBlock.fourthAnswerFound();

        assertTrue(isNotHidden);
    }

    @Test
    public void fifthAnswerBlockOpened () {
//
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        QuestionsBlock objQuestionsBlock = new QuestionsBlock(driver);

        boolean isNotHidden = objQuestionsBlock.fifthAnswerFound();

        assertTrue(isNotHidden);
    }

    @Test
    public void sixthAnswerBlockOpened () {
//
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        QuestionsBlock objQuestionsBlock = new QuestionsBlock(driver);

        boolean isNotHidden = objQuestionsBlock.sixthAnswerFound();

        assertTrue(isNotHidden);
    }

    @Test
    public void seventhAnswerBlockOpened () {
//
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        QuestionsBlock objQuestionsBlock = new QuestionsBlock(driver);

        boolean isNotHidden = objQuestionsBlock.seventhAnswerFound();

        assertTrue(isNotHidden);
    }

    @Test
    public void eighthAnswerBlockOpened () {
//
        driver = new ChromeDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        QuestionsBlock objQuestionsBlock = new QuestionsBlock(driver);

        boolean isNotHidden = objQuestionsBlock.eighthAnswerFound();

        assertTrue(isNotHidden);
    }

    @After
    public void tearDown() {
        // Закрой браузер
        driver.quit();
    }

}