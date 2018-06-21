package Tests;

import Pages.BaseSteps;
import Pages.BaseTest;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Tests {

    BaseSteps homeSteps;
    WebDriver driver;

    @Before
    public void before() {

        homeSteps = new BaseSteps(BaseTest.getDriver());
        homeSteps.prepare();

    }

    @Test
    public void first() {

        homeSteps.open();
        homeSteps.LinkInstagramEnabled();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       /** homeSteps.scroll();**/

    }

    @AfterClass
    public static void afterClass() {
        BaseTest.closeDriver();
    }

}
