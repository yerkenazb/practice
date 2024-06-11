package practice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Compass {

    @DataProvider(name="test-data")
    public static Object[][] neigborhoods () throws InterruptedException {

         return new Object[][]{{1}, {2}, {3},
                 {4}, {5}};

    }

    @Test(dataProvider="test-data")
   public void search (int index) throws InterruptedException {

//    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.compass.com/homes-for-sale/manhattan-ny ");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement signInButton = driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/button"));
        signInButton.click();
        WebElement buyerSellerButton = driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[2]/div/button[2]"));
        buyerSellerButton.click();
        WebElement emailButton = driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[2]/div/button[5]/div"));
        emailButton.click();
        WebElement inputEmail = driver.findElement(By.name("email"));
        wait.until(ExpectedConditions.elementToBeClickable(inputEmail));
        inputEmail.sendKeys("compass9012@gmail.com" + Keys.ENTER);
        WebElement inputPassword = driver.findElement(By.name("password"));
        wait.until(ExpectedConditions.elementToBeClickable(inputPassword));
        inputPassword.sendKeys("Q@TakeHome0987654321" + Keys.ENTER);
        //navigating to homePage
        // driver.get(driver.getCurrentUrl());
        WebElement homeTab = driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/a[@href='/app/home/']"));
        try {
            homeTab = driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/a[@href='/app/home/']"));
        } catch (NoSuchElementException e) {
            Thread.sleep(5000);
        }

        homeTab.click();
        WebElement searchOption = driver.findElement(By.xpath("//a[@title='Search']"));
        searchOption.click();
        WebElement locationTab = driver.findElement(By.xpath("//dt[@title='Locations']"));
        locationTab.click();
        //since Manhattan wasn't a dropdown from Select Class, I had to just locate elements with xpath
        WebElement manhattanFilter = driver.findElement(By.xpath("//span[@data-uc-toggle-id='2']"));
        manhattanFilter.click();
        //neighborhood #1
        Thread.sleep(1000);
        List<WebElement> allManhattan = driver.findElements(By.xpath("//div[2]/search-select/div/div/div[2]/div/label/input"));
        Thread.sleep(3000);
        allManhattan.get(index).click();


//        WebElement neighborhood = driver.findElement(By.xpath("//div[2]/search-select/div/div/div[2]/div/label/input"));
//        neighborhood.click();

//        WebElement chelsea = driver.findElement(By.xpath("//span[.='Chelsea']"));
//        chelsea.click();
        locationTab.click();
        WebElement priceTab = driver.findElement(By.xpath("//div[@class='ag-header-cell-label']/span[.='Price']"));
        priceTab.click();
        Thread.sleep(3000);
        priceTab.click();
        Thread.sleep(3000);
        String mainWindow = driver.getWindowHandle();
        WebElement maxPrice = driver.findElement(By.xpath("//*[@id='center']/div/div[3]/div[3]/div/div/div[1]/div[5]"));

        WebElement firstAddress = driver.findElement(By.xpath("//*[@id='center']/div/div[3]/div[3]/div/div/div[1]/div[2]"));
        firstAddress.click();

        WebElement openNewTab = driver.findElement(By.xpath("//span[.='Open in new tab']"));

        openNewTab.click();

        Set<String> allWindowNames = driver.getWindowHandles();

        String secondWindow = "";
        for(String name: allWindowNames ){
            if(!name.equals(mainWindow)){
                secondWindow=name;
            }
        }

        driver.switchTo().window(secondWindow);
        Thread.sleep(3000);
        String listingUrl = driver.getCurrentUrl();

        System.out.println(listingUrl);

    }
   }


