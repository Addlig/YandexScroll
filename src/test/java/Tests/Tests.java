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

        homeSteps.tvEnabled();
        homeSteps.tvClick();
        homeSteps.filmsDisplayed();
        homeSteps.moveFilms();
        homeSteps.filmsClick();
        homeSteps.searchDisplayed();
        homeSteps.searchClick();
        homeSteps.sendKeys("Монгол");

    }

    @Test
    public void two() {

        homeSteps.tvEnabled();
        homeSteps.JSClick();
        homeSteps.filmsDisplayed();
        homeSteps.moveFilms();
        homeSteps.filmsClick();
        homeSteps.searchDisplayed();
        homeSteps.searchClick();
        homeSteps.JSEnter();
        homeSteps.poiskDisplayed();
        homeSteps.poiskClick();

    }

}
