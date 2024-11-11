import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionsBlock {
    private WebDriver driver;

    private final By question1 = By.id("accordion__heading-0");
    private final By answer1 = By.id("accordion__panel-0");

    private final By question2 = By.id("accordion__heading-1");
    private final By answer2 = By.id("accordion__panel-1");

    private final By question3 = By.id("accordion__heading-2");
    private final By answer3 = By.id("accordion__panel-2");

    private final By question4 = By.id("accordion__heading-3");
    private final By answer4 = By.id("accordion__panel-3");

    private final By question5 = By.id("accordion__heading-4");
    private final By answer5 = By.id("accordion__panel-4");

    private final By question6 = By.id("accordion__heading-5");
    private final By answer6 = By.id("accordion__panel-5");

    private final By question7 = By.id("accordion__heading-6");
    private final By answer7 = By.id("accordion__panel-6");

    private final By question8 = By.id("accordion__heading-7");
    private final By answer8 = By.id("accordion__panel-7");

    public QuestionsBlock (WebDriver driver){
        this.driver = driver;
    }

    public boolean firstAnswerFound() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(question1));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(question1));
        driver.findElement(question1).click();
        return new WebDriverWait(driver, 3).until(ExpectedConditions.attributeToBe(answer1, "hidden", ""));
    }

    public boolean secondAnswerFound() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(question2));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(question2));
        driver.findElement(question2).click();
        return new WebDriverWait(driver, 3).until(ExpectedConditions.attributeToBe(answer2, "hidden", ""));
    }

    public boolean thirdAnswerFound() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(question3));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(question3));
        driver.findElement(question3).click();
        return new WebDriverWait(driver, 3).until(ExpectedConditions.attributeToBe(answer3, "hidden", ""));
    }

    public boolean fourthAnswerFound() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(question4));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(question4));
        driver.findElement(question4).click();
        return new WebDriverWait(driver, 3).until(ExpectedConditions.attributeToBe(answer4, "hidden", ""));
    }

    public boolean fifthAnswerFound() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(question5));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(question5));
        driver.findElement(question5).click();
        return new WebDriverWait(driver, 3).until(ExpectedConditions.attributeToBe(answer5, "hidden", ""));
    }

    public boolean sixthAnswerFound() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(question6));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(question6));
        driver.findElement(question6).click();
        return new WebDriverWait(driver, 3).until(ExpectedConditions.attributeToBe(answer6, "hidden", ""));
    }

    public boolean seventhAnswerFound() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(question7));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(question7));
        driver.findElement(question7).click();
        return new WebDriverWait(driver, 3).until(ExpectedConditions.attributeToBe(answer7, "hidden", ""));
    }

    public boolean eighthAnswerFound() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(question8));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(question8));
        driver.findElement(question8).click();
        return new WebDriverWait(driver, 3).until(ExpectedConditions.attributeToBe(answer8, "hidden", ""));
    }
}
