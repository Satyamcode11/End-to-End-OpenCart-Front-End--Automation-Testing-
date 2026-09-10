package Tests;

import Base.BaseTest;
import Pages.HomePage;
import Pages.RegisterPage;
import Utilities.RegistrationData;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test(dataProvider = "registration",
            dataProviderClass = RegistrationData.class)
    public void validRegistrationTest
            (String firstName,
             String lastName,
             String email,
             String password,
             boolean privacyPolicy) {

        HomePage homePage = new HomePage(driver);
        homePage.clickMyAccount();
        RegisterPage registerPage = homePage.clickRegister();

        registerPage.enterFirstName(firstName);
        registerPage.enterLastName(lastName);
        registerPage.enterEmail(email);
        registerPage.enterPassword(password);

        if (privacyPolicy) {
            registerPage.selectPrivacyPolicy();
        }
        registerPage.clickContinueBtn();
    }

}
