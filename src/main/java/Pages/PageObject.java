package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageObject {

    BaseTest basetest = new BaseTest();
    @FindBy(css = "[title='Instagram']")
    private WebElement LinkInstagram;
    @FindBy(css = "input[id=city__front-input]")
    private WebElement geoName;
    @FindBy(css = "[class='b-autocomplete-item__reg']")
    private WebElement linkTitle;
    @FindBy(xpath = "//*[@class='b-autocomplete-item__reg'][contains(text(), 'Лондон')]")
    private WebElement linkTitleLondon;


    public PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public boolean isLinkInstagramEnabled() {
        return LinkInstagram.isDisplayed();
    }


    public boolean isGeoFieldDisplayed() {
        return geoName.isDisplayed();
    }

    /**
     * This lin is present
     *
     * @return
     */


    public boolean isLinkTitleLondonDisplayed() {
        return linkTitleLondon.isDisplayed();
    }

    public String londonText() {
        return linkTitle.getText();
    }


    public void geoFieldClear() {
        geoName.clear();
    }

    public void printText(String text) {
        geoName.sendKeys(text);
    }


    public void clickLink() {
        linkTitle.click();

    }

    public void printText2(String text2) {
        geoName.sendKeys(text2);
    }




}



