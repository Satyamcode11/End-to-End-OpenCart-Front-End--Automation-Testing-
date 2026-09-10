package Utilities;

import org.testng.annotations.DataProvider;

public class RegistrationData {

    @DataProvider(name="registration")
    public Object[][] regsiterData(){
         return new Object[][]{

                 {"Satyam","Moharana","test@gmail.com","test12345",true}

         };

    }
}
