import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageScooter {
    private WebDriver driver;

    //кнопка заказать
    private final By orderButton = By.className("Button_Button__ra12g");
    private final By secondOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");

    //находим поля формы личных данных и кнопку Далее
    private final By nameInput = By.xpath(".//input[@type='text' and @placeholder='* Имя']");
    private final By surnameInput = By.xpath(".//input[@type='text' and @placeholder='* Фамилия']");
    private final By addressInput = By.xpath(".//input[@type='text' and @placeholder='* Адрес: куда привезти заказ']");
    private final By metroStation = By.xpath(".//input[@placeholder='* Станция метро']");
    private final By chosenStation = By.xpath(".//button[@value='111']");


    private final By phoneInput = By.xpath(".//input[@type='text' and @placeholder='* Телефон: на него позвонит курьер']");

    private final By onwardsButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");


    //находим поля формы Аренды и кнопку Заказать
    private final By dateInput = By.xpath(".//input[@type='text' and @placeholder='* Когда привезти самокат']");
    private final By chosenDate = By.xpath(".//div[@aria-label='Choose понедельник, 23-е сентября 2024 г.']");
    private final By timeInput = By.className("Dropdown-placeholder");
    private final By chosenTime = By.xpath(".//div[@class='Dropdown-option' and text()='двое суток']");
    //private By blackColourInput = By.id("black");
    private final By greyColourInput = By.id("grey");
    private final By commentInput = By.xpath(".//input[@type='text' and @placeholder='Комментарий для курьера']");
    private final By submitButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //находим кнопку Да
    private final By yesButton = By.xpath(".//div[@class='Order_Modal__YZ-d3']//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //находим Попап подтвержденного заказа
    private final By orderPopup = By.className("Order_Modal__YZ-d3");



    public HomePageScooter (WebDriver driver){
        this.driver = driver;
    }

    //клик по кнопке Заказать
    public void orderButtonClick() {
        driver.findElement(orderButton).click();
    }

    public void orderSecondButtonClick() {

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(secondOrderButton));
        driver.findElement(secondOrderButton).click();
    }

    //Заполнить поля формых личных данных и кликнуть по кнопке Далее
    public void fillInPersonalForm(String name, String surname, String address, String phone) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(nameInput));
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(surnameInput).sendKeys(surname);
        driver.findElement(addressInput).sendKeys(address);

        driver.findElement(metroStation).click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(chosenStation));
        driver.findElement(chosenStation).click();

        driver.findElement(phoneInput).sendKeys(phone);
        driver.findElement(onwardsButton).click();
    }

    //Заполнить поля формы Аренды и кликнуть по кнопкам Заказать и Да
    public void fillInRentForm (String comment) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(dateInput));
        driver.findElement(dateInput).click();
        driver.findElement(chosenDate).click();


        driver.findElement(timeInput).click();
        driver.findElement(chosenTime).click();

        driver.findElement(greyColourInput).click();
        driver.findElement(commentInput).sendKeys(comment);
        driver.findElement(submitButton).click();
    }

    public void orderScooterButtonClick () {
        driver.findElement(yesButton).click();
    }

    public boolean findOrderPopup () {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.attributeToBe(orderPopup, "hidden", ""));

    }

}

