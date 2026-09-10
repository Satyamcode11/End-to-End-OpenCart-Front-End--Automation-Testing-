package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    private final By myAccount = By.xpath("//span[text()='My Account']");

    private final By registerLink = By.xpath("//a[text()=\"Register\"]");

    private final WebDriverWait wait;

    public HomePage(WebDriver driver) {
        super(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Click on My Account..........
    public void clickMyAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(myAccount)).click();

    }

    //Click on Register.........
    public RegisterPage clickRegister() {
        driver.findElement(registerLink).click();
        return new RegisterPage(driver);
    }
}
