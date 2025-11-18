package Selenium_Review;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S01_SetUpBrowser {

    /*
    MAC ---> COMMAND + N
    WINDOWS ---> ALT + INSERT
     */

    @Test
    public void SetUpBrowser() {
         //FirefoxDriver driver = new FirefoxDriver();
        //ChromeDriver driver=new ChromeDriver();
        WebDriver driver = getDriver("chrome");
        // SafariDriver driver = new SafariDriver();
       // EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");

        driver.quit();


    }



    public WebDriver getDriver(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
          return  new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
          return  new FirefoxDriver();

        }
        return null;

    }
}
