package com.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StandAloneTest {

    public static void main(String[] args) {

        //Automatically chrome driver are available in system
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String userName = "Satyammoharana011@gmail.com";
        String password = "Satyam@11";

        String[] items = {"ADIDAS","IPHONE"};

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/client");

        addTo(driver,items,userName,password,wait);




    }
    public static void addTo(WebDriver driver, String []items ,String userName,String password,WebDriverWait wait){
        int j =0;
        driver.findElement(By.id("userEmail")).sendKeys(userName); //Enter the username
        driver.findElement(By.id("userPassword")).sendKeys(password); //Enter the password
        driver.findElement(By.id("login")).click(); //click the login button

        //I select the web elements by there class name
        List<WebElement> products = driver.findElements(By.cssSelector(".col-lg-4"));

        for (int i = 0; i< products.size();i++){

           String [] productsName = products.get(i).getText().split(" ");
           String item = productsName[0].trim();

           List<String> list = new ArrayList<>(Arrays.asList(items));


           if (list.contains(item)){
               j++;
               wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='toast-container']"))));
               wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@id='toast-container']"))));

               driver.findElements(By.xpath("//div[@class='card-body']/button[2]")).get(i).click();

               if (j==items.length){
                   break;
               }
           }



        }
        driver.close();

    }

}
