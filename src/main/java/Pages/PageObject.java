package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageObject {

    BaseTest basetest = new BaseTest();
//*[@id="local-offers-first"]

    @FindBy(css = "[title='Instagram']")
    private WebElement LinkInstagram;
    @FindBy(xpath = "//*[@id=\"local-offers-first\"]")
    private WebElement Apple;


    public PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isLinkInstagramEnabled() {
        return LinkInstagram.isDisplayed();
    }

    public boolean AppleisDisplayed() {
        return Apple.isEnabled();

    }

    public void appleCheckbox() {
        if (!Apple.isSelected()) {
            Apple.click();
        }
    }

    public String getTextAttribute() {
        return Apple.getAttribute("type");
    }

    public boolean AppleisSelected() {
        return Apple.isSelected();

    }

}



