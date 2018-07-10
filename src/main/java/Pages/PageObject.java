package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageObject {

    Actions action = new Actions(BaseTest.getDriver());
    JavascriptExecutor js=(JavascriptExecutor) BaseTest.getDriver();

    @FindBy(css = "[title='ТV-программа']")
    private WebElement tv;
    @FindBy(xpath = "//*[@id=\"local-offers-first\"]")
    private WebElement Apple;
    @FindBy(css = "[title='Все фильмы онлайн']")
    private WebElement films;
    @FindBy(id = "search-movie-str")
    private WebElement search;
    @FindBy(css = "[value='Найти']")
    private WebElement poisk;

    public PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean tvEnabled() {
        return tv.isDisplayed();
    }

    public boolean filmsDisplayed() {
        return films.isEnabled();
    }

    public void click() {
        action.click(tv).perform();
    }

    public void clickFilms() {
        action.click(films).perform();
    }

    public boolean searchEnabled() {
        return search.isEnabled();
    }

    public void filmsMoveToElement() {
        action.moveToElement(films).perform();
    }
    public void searchClick() {
        WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("search-movie-str")));
        element.click();
    }


    public void sendKeys(java.lang.CharSequence... text) {
        action.sendKeys(text);
    }

    public void tvJSClick() {
        js.executeScript("arguments[0].click();", tv);
    }
    public void JSEnter() {
        js.executeScript("arguments[0].setAttribute('value', 'Монгол');", search);
    }

    public boolean poiskEnabled() {
        return poisk.isEnabled();
    }

    public void poiskClick() {
        js.executeScript("arguments[0].click();", poisk);
    }
}



