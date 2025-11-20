package Selenium_Review;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S03_Locate_Interact_Assertions {


    @Test
    void test1() throws InterruptedException {

        //set up browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //navigate to https://www.demoblaze.com/index.html
        driver.get("https://www.demoblaze.com/index.html");
        //click Sign Up
        By signUpLocator = By.partialLinkText("Sign up");
        WebElement signUpElement = driver.findElement(signUpLocator);
        signUpElement.click();


        //Create a fake username //faker

        /*
        Creating username process
        create a fake username
        Read usernames .txt file and put in a list
        check current username in the list or not
        if it is not write in text
        and return the  user

         */

        Faker faker = new Faker();
        String username="test_user"+faker.name().firstName()+faker.number().numberBetween(1,1000);

        System.out.println("username = " + username);
        //TODO HOMEWORK
        //You will create a method to save your usernames in a txt file


        //Enter username
        By usernameLocator = By.id("sign-username");
        WebElement usernameElement = driver.findElement(usernameLocator);
        usernameElement.sendKeys(username);
        //Enter password //Test12334
        By passwordLocator = By.id("sign-password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys(username);

        Thread.sleep(5000);
        //Click SignUp button
        By signUpLocatorInModal = By.xpath("//button[.='Sign up']");
        driver.findElement(signUpLocatorInModal).click();

        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();

        String actualMessage = alert.getText();
        Assertions.assertTrue(actualMessage.contains("Sign up successful"));
        alert.accept();
        Thread.sleep(5000);
        //Click Log in Link

        By logInLocator = By.partialLinkText("Log in");
        WebElement logInElement = driver.findElement(logInLocator);
        logInElement.click();

        //Enter Username
        //Enter password
        //Click Log in
        Thread.sleep(5000);
        loginApp(driver,username,username);
        //Verify the user logged in

        //TODO HOMEWORK
        //Ty to create a method to solve that problem about sync issue
        //Yuo will create a loop to handle this issue.
        String nameofuser = driver.findElement(By.id("nameofuser")).getText();
        Assertions.assertTrue(nameofuser.contains(username));


        driver.close();

    }

    private void loginApp(WebDriver driver, String username, String password) throws InterruptedException {
        driver.findElement(By.id("loginusername")).sendKeys(username);
        driver.findElement(By.id("loginpassword")).sendKeys(username);
        Thread.sleep(5000);
        By loginLocatorInModal = By.xpath("//button[.='Log in']");
        driver.findElement(loginLocatorInModal).click();
    }
}
