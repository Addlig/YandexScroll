package Tests;

import Pages.BaseSteps;
import Pages.BaseTest;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class Tests {

    BaseSteps homeSteps;


    @AfterClass
    public static void afterClass() {
        BaseTest.closeDriver();
    }

    @Before
    public void before() {

        homeSteps = new BaseSteps(BaseTest.getDriver());
        homeSteps.prepare();
        homeSteps.open();
    }

    @Test
    public void first() {

        homeSteps.LinkInstagramEnabled();
        homeSteps.scrollPage();
        homeSteps.scrollUp();
        homeSteps.appleDisplayed();
        homeSteps.appleClick();
        homeSteps.checkboxIsChecked();
        homeSteps.type();
    }

}
