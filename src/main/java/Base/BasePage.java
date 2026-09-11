package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(WebElement element) {
        element.click();
    }

    protected void enterText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(WebElement element) {
        return element.getText();
    }

    protected boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

}

/*
"BasePage is a common parent class for my Page Object classes. " +
"It contains reusable Selenium operations such as clicking elements, " +
 "entering text, retrieving text, and checking element visibility. " +
"This reduces code duplication and improves maintainability."*/
