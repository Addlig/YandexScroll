package Pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageObject {

    BaseTest basetest = new BaseTest();
//*[@id="local-offers-first"]

    @FindBy(css = "[title='Instagram']")
    private WebElement LinkInstagram;
    @FindBy(xpath = "//*[@id=\"local-offers-first\"]")
    private WebElement Apple;
    @FindBy(css= "input[type=\"checkbox\"][name=\"Производитель Apple\"]")
    private WebElement Apple1;



    public PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isLinkInstagramEnabled() {
        return LinkInstagram.isDisplayed();
    }

    public boolean AppleisDisplayed() {
        return  Apple.isEnabled() ;

    }

    public void appleCheckbox() {
        if (!Apple.isSelected()) {
            Apple.click();
        }
    }

    public String getTextAttribute() {
        return Apple.getAttribute("type");
    }
}



