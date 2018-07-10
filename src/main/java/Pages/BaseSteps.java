package Pages;


import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static org.junit.Assert.assertTrue;


public class BaseSteps {

    PageObject homepage;


    public BaseSteps (WebDriver driver) {
        this.homepage = new PageObject(driver);
    }

    @Step
    public void open() {
        BaseTest.getDriver().get("https://www.tut.by/");
    }

    @Step
    public void prepare() {
        BaseTest.prepareDriver();
    }

    @Step
    public void tvEnabled() {
        assertTrue("не доступно", homepage.tvEnabled());
    }


    @Step
    public void scrollUp() {
        ((JavascriptExecutor) BaseTest.getDriver()).executeScript("window.scrollBy(document.body.scrollHeight, 0)");
        System.out.println("Скролл Up");
    }
    @Step
    public void tvClick() {
        homepage.click();
    }

    @Step
    public void filmsClick() {
        homepage.clickFilms();
    }

    @Step
    public void searchClick() {
        homepage.searchClick();
    }

    @Step
    public void filmsDisplayed() {
       assertTrue("не доступно", homepage.filmsDisplayed());
    }

    @Step
    public void searchDisplayed() {
        assertTrue("не доступно", homepage.searchEnabled());
    }

    @Step
    public void moveFilms() {
        homepage.filmsMoveToElement();
    }

    @Step
    public void sendKeys(java.lang.CharSequence... text) {
        homepage.sendKeys(text);
    }

    @Step
    public void JSClick() {
        homepage.tvJSClick();
    }

    @Step
    public void JSEnter() {
        homepage.JSEnter();
    }

    @Step
    public void poiskDisplayed() {
        assertTrue("не доступно", homepage.poiskEnabled());
    }

    @Step
    public void poiskClick() {
        homepage.poiskClick();
    }
}
