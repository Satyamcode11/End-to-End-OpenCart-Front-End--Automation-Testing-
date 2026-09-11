package Utilities;

import org.testng.annotations.DataProvider;

public class RegistrationData {

    @DataProvider(name = "registration")
    public Object[][] registerData() {
        return new Object[][]{

                // 1. Positive Registration
                {"Satyam", "Moharana", "registration01@gmail.com", "test12345", true},

                // 2. Blank First Name
                {"", "Moharana", "registration02@gmail.com", "test12345", true},

                // 3. Blank Last Name
                {"Satyam", "", "registration03@gmail.com", "test12345", true},

                // 4. Blank Email
                {"Satyam", "Moharana", "", "test12345", true},

                // 5. Invalid Email Format
                {"Satyam", "Moharana", "abc", "test12345", true},

                // 6. Blank Password
                {"Satyam", "Moharana", "registration04@gmail.com", "", true},

                // 7. Privacy Policy Unchecked
                {"Satyam", "Moharana", "registration05@gmail.com", "test12345", false},

                // 8. BVA - First Name Minimum (1 character)
                {"S", "Moharana", "bva01@gmail.com", "test12345", true},

                // 9. BVA - First Name Maximum (32 characters)
                {"SatyamSatyamSatyamSatyamSatyamSat",
                        "Moharana", "bva02@gmail.com", "test12345", true},

                // 10. BVA - First Name Above Maximum (33 characters)
                {"SatyamSatyamSatyamSatyamSatyamSaty",
                        "Moharana", "bva03@gmail.com", "test12345", true},

                // 11. BVA - Last Name Minimum (1 character)
                {"Satyam", "M", "bva04@gmail.com", "test12345", true},

                // 12. BVA - Last Name Maximum (32 characters)
                {"Satyam", "MoharanaMoharanaMoharanaMoharanaMo",
                        "bva05@gmail.com", "test12345", true},

                // 13. BVA - Last Name Above Maximum (33 characters)
                {"Satyam", "MoharanaMoharanaMoharanaMoharanaMoh",
                        "bva06@gmail.com", "test12345", true},

                // 14. BVA - Password Minimum (4 characters)
                {"Satyam", "Moharana", "bva07@gmail.com", "1234", true},

                // 15. BVA - Password Maximum (20 characters)
                {"Satyam", "Moharana", "bva08@gmail.com",
                        "12345678901234567890", true},

                // 16. BVA - Password Above Maximum (21 characters)
                {"Satyam", "Moharana", "bva09@gmail.com",
                        "123456789012345678901", true},

                // 17. BVA - Email Maximum (96 characters)
                {"Satyam", "Moharana",
                        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                                + "aaaaaaaaaaaaaaaaaaaaaaaaaaa@gmail.com",
                        "test12345", true},

                // 18. BVA - Email Above Maximum (97 characters)
                {"Satyam", "Moharana",
                        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                                + "aaaaaaaaaaaaaaaaaaaaaaaaaaa@gmail.com",
                        "test12345", true}
        };

    }
}
