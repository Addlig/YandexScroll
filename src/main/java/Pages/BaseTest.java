package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static WebDriver driver = null;


    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Driver/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void prepareDriver() {
        if (driver != null) {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // неявные ожидания
            driver.manage().window().maximize();
        }
    }

}


