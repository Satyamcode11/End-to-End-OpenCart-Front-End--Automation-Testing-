package Tests;

import Base.BaseTest;
import Pages.HomePage;
import Pages.RegisterPage;
import Utilities.RegistrationData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test(dataProvider = "registration", dataProviderClass = RegistrationData.class)
    public void validRegistrationTest(
            String firstName,
            String lastName,
            String email,
            String password,
            boolean privacyPolicy)
            {

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


        //Verify First Name Validation only when First Name is empty.
        if (firstName.isEmpty()) {
            Assert.assertEquals(registerPage.getFirstNameError(), "First Name must be between 1 and 32 characters!");
        }

        if (lastName.isEmpty()) {
            Assert.assertEquals(registerPage.getLastNameError(), "Last Name must be between 1 and 32 characters!");
        }

        if (email.isEmpty()) {
            Assert.assertEquals(registerPage.getEmailError(), "E-Mail Address does not appear to be valid!");
        }

        //If the existing email is type the message is shown
        if (email.equals("registration01@gmail.com")) {
            Assert.assertEquals(registerPage.getEmailError(), " Warning: E-Mail Address is already registered!");
        }

        //If Password field is empty
        if (password.isEmpty()) {
            Assert.assertEquals(registerPage.getPassError(), "Password must be between 4 and 20 characters!");
        }

        //If Privacy Policy Toggle is OFF
        if (!privacyPolicy) {
            Assert.assertEquals(registerPage.getErrorMessage(), "Warning: You must agree to the Privacy Policy!");
        }

    }


}
