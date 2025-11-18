package Selenium_Review;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S02_Navigation {

    @Test
    void navigationTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");
        driver.navigate().to("https://practice.cydeo.com/autocomplete");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.close();

    }
}
