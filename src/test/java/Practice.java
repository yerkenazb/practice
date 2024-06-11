

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Practice {


    public static void main(String[] args) throws InterruptedException {


            /**
             * While working,  I would keep my elements in a separate page.
             * I went to homepage and pressed on locations filter from there.
             */
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
            WebElement chelsea = driver.findElement(By.xpath("//span[.='Chelsea']"));
            chelsea.click();
            locationTab.click();
            WebElement pageDropDown = driver.findElement(By.xpath("//select[@ng-model='paginator.pagination.itemsPerPage']"));
            Select select = new Select(pageDropDown);
            select.selectByVisibleText("120");
            String currentPage = driver.findElement(By.xpath("//span[1][@class='cx-paginator-text']")).getText();
            String lastPage = driver.findElement(By.xpath("//span[2][@class='cx-paginator-text']")).getText();
//            Thread.sleep(10000);
            WebElement nextButton = driver.findElement(By.xpath("//button[@class='cx-paginator-btn cx-paginator-btn--next']"));
            List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ag-body-container']//div[@colid='listing.price.lastKnown']"));
            double maxPrice = 1;
//
//        for (WebElement price : prices) {
//            String priceTrim = price.getAttribute("innerText");
//            String priceTrim2 = priceTrim.substring(1).replace(",", "").trim();
//            Double listingPrice = Double.parseDouble(priceTrim2);
//            if (listingPrice > maxPrice) {
//                maxPrice = listingPrice;
//                    }
//                }
//            String strDouble = String.format("%.0f", maxPrice);
//            System.out.println(strDouble);
        //!currentPage.equals(lastPage)
//         while (nextButton.getAttribute("disabled")==null) {
            while (nextButton.getAttribute("disabled")==null) {
                prices = driver.findElements(By.xpath("//div[@class='ag-body-container']//div[@colid='listing.price.lastKnown']"));
                for (WebElement price : prices) {
                    try {
                        String priceTrim = price.getAttribute("innerText");
                        String priceTrim2 = priceTrim.replace("$", "").replace(",", "").trim();
                        Double listingPrice = Double.parseDouble(priceTrim2);
                        if (listingPrice > maxPrice) {
                            maxPrice = listingPrice;
                        }
                    }catch(NumberFormatException e ){
                        System.out.println(e.fillInStackTrace());
                    }

                }
                try {
                    nextButton.click();
                    Thread.sleep(3000);
                }catch (ElementClickInterceptedException e){
                    System.out.println(e.fillInStackTrace());
                }
            }
            String strDouble = String.format("%.0f", maxPrice);
            System.out.println(strDouble);
        }
    }



