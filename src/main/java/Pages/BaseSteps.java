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
   /** @Step
    public scrollPage() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }**/
}
