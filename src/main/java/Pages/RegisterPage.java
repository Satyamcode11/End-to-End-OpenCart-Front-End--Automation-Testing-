package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    private WebDriver driver;

    private By firstName = By.cssSelector("#input-firstname");
    private By lastName = By.cssSelector("input[placeholder=\"Last Name\"]");
    private By email = By.cssSelector("input[type=\"Email\"]");
    private By password = By.xpath("//input[@name=\"password\"]");
    private By privacyPolicy = By.xpath("//input[@name=\"agree\"]");
    private By continueBtn = By.cssSelector(".btn-primary");

    //Create a constructor
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //Enter firstName
    public void enterFirstName(String firstNameValue) {
        driver.findElement(firstName).sendKeys(firstNameValue);
    }

    //Enter lastName
    public void enterLastName(String lastNameValue) {
        driver.findElement(lastName).sendKeys(lastNameValue);
    }


    //Enter Email
    public void enterEmail(String emailValue) {
        driver.findElement(email).sendKeys(emailValue);
    }

    //Enter Password
    public void enterPassword(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
    }


    //Select Privacy Policy
    public void selectPrivacyPolicy() {
        driver.findElement(privacyPolicy).click();
    }

    //Click Continue Button
    public void clickContinueBtn() {
        driver.findElement(continueBtn).click();
    }


}
