package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class HRS {

    @Test
    public void login()  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement usernameBox = driver.findElement(By.id("username"));
        usernameBox.sendKeys("angular");
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("password");


        WebElement descriptionBox = driver.findElement(By.xpath("//input[@name='formly_1_input_username_0']"));
        descriptionBox.sendKeys("Angular is the username");


        WebElement loginButton = driver.findElement(By.cssSelector("button[class='btn btn-danger']"));
        loginButton.click();


       WebElement homePageMessage = driver.findElement(By.xpath("//p[@class='ng-scope']/preceding-sibling::p"));
       String actualMessage = homePageMessage.getText();
       String expectedMessage = "You're logged in!!";

       Assert.assertEquals(expectedMessage,actualMessage, "You have successfully Logged In");


    }
}
