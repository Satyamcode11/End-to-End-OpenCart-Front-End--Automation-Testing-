package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPage extends BasePage {

    private WebDriver driver;

    private By firstName = By.cssSelector("#input-firstname");
    private By lastName = By.cssSelector("input[placeholder=\"Last Name\"]");
    private By email = By.cssSelector("input[type=\"Email\"]");
    private By password = By.xpath("//input[@name=\"password\"]");
    private By privacyPolicy = By.xpath("//input[@name=\"agree\"]");
    private By continueBtn = By.cssSelector(".btn-primary");

    //Message displayed when First Name is invalid or an empty
    private By firstNameError = By.id("error-firstname");

    //Message displayed when Last Name is invalid or an empty
    private By lastNameError = By.id("error-lastname");

    //Message displayed when email is invalid or an empty
    private By emailError = By.id("error-email");

    //Message displayed when password is an empty
    private By passwordError = By.id("error-password");

    //Common container for dynamic warning/error messages.
    private By alertMessage = By.id("alert");


    //Create a constructor
    public RegisterPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
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

    //Return the message displayed for the First Name Field.
    public String getFirstNameError() {
        return driver.findElement(firstNameError).getText();
    }

    //Return the message displayed for the Last Name Field.
    public String getLastNameError() {
        return driver.findElement(lastNameError).getText();
    }

    //Return the message displayed for the email Field.
    public String getEmailError() {
        return driver.findElement(emailError).getText();
    }

    //Return the message displayed for the password field.
    public String getPassError() {
        return driver.findElement(passwordError).getText();
    }


    //Return whatever warning/error message is currently diplayed
    public String getErrorMessage() {

        // Waits until the alert container becomes visible,
        // then returns the warning/error message displayed inside it.

        wait.until(ExpectedConditions.visibilityOfElementLocated(alertMessage));
        return driver.findElement(alertMessage).getText();
    }


}
