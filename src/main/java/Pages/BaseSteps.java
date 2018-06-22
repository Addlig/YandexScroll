package Pages;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class BaseSteps {

    PageObject homePage;

    public BaseSteps(WebDriver driver) {
        this.homePage = new PageObject(driver);
    }

    @Step
    public void open() {
        BaseTest.getDriver().get("https://market.yandex.by/catalog/54726/list?local-offers-first=0&deliveryincluded=0&onstock=1");
    }

    @Step
    public void prepare() {
        BaseTest.prepareDriver();
    }

    @Step
    public void LinkInstagramEnabled() {
        System.out.println("Instagram доступно");
        assertTrue("Instagram не доступно",
                homePage.isLinkInstagramEnabled());
    }



    @Step
    public void scrollPage() {
        ((JavascriptExecutor) BaseTest.getDriver()).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println("Скролл Down");
    }

    @Step
    public void scrollUp() {
        ((JavascriptExecutor) BaseTest.getDriver()).executeScript("window.scrollBy(document.body.scrollHeight, 0)");
        System.out.println("Скролл Up");
    }


    @Step
    public void appleClick() {
        homePage.appleCheckbox();
        System.out.println("Выбран чекбокс");
    }

    @Step
    public void appleDisplayed() {
        assertTrue("Чекбокс Apple не доступно", homePage.AppleisDisplayed());
        System.out.println("чекбокс отображается");

    }

    @Step
    public void type() {
        homePage.getTextAttribute();
        System.out.println("Атрибут = " + homePage.getTextAttribute());
    }

}
