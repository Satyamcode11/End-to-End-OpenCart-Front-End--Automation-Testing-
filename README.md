# OpenCart E-Commerce – Selenium Automation Testing

## Project Overview

This project is a **Selenium WebDriver automation testing framework** developed for testing the registration functionality of the OpenCart e-commerce website.

The project is designed using **Java, Selenium WebDriver, TestNG, Maven, and Page Object Model (POM)**.

The Registration module covers different types of test scenarios, including **positive, negative, validation, and boundary test cases**.

---

## Modules Covered

### Registration Module

The Registration module currently covers:

* Valid user registration
* Mandatory field validation
* First Name validation
* Last Name validation
* Email validation
* Password validation
* Privacy Policy validation
* Invalid email scenarios
* Blank field scenarios
* Boundary/edge-value scenarios
* Validation and warning/error messages
* Existing email registration scenario

---

##  Technologies & Tools Used

* **Java**
* **Selenium WebDriver**
* **TestNG**
* **Maven**
* **Page Object Model (POM)**
* **DataProvider**
* **WebDriverWait / Explicit Wait**
* **Git & GitHub**
* **IntelliJ IDEA**

---

## Design Pattern

### Page Object Model (POM)

The framework follows the **Page Object Model** design pattern.

Each web page has a separate Page Class containing:

* Web element locators
* Page actions
* Reusable methods

For example:

```text
HomePage.java
RegisterPage.java
```

This approach improves:

* Code reusability
* Maintainability
* Readability
* Separation of test logic and page logic

---

## Test Data Management

TestNG **DataProvider** is used to provide different sets of test data.

The DataProvider is designed around **test scenarios**, rather than simply creating multiple user accounts.

Test data includes:

* Positive data
* Negative data
* Blank values
* Invalid values
* Boundary values
* Validation scenarios

This allows the same automation test to execute with multiple data sets.

---

## Testing Approach

The Registration module follows a combination of:

### Positive Testing

Verifies that a user can successfully register using valid information.

### Negative Testing

Verifies that the application correctly handles invalid input.

### Boundary Testing

Verifies application behavior at minimum, maximum, and edge input values.

### Validation Testing

Verifies that appropriate validation or warning messages are displayed when required fields are missing or incorrect.

---

## 📈 Future Enhancements

The framework will be extended to automate additional OpenCart modules:

* Login
* Logout
* Forgot Password
* Product Search
* Add to Cart
* Checkout

Additional framework enhancements may include:

* Extent Reports
* Screenshots on test failure
* Logging
* Cross-browser testing
* Configuration/property files
* CI/CD integration

---

##  Author

**Satyam Moharana**

Software Testing / Automation Testing

### Skills Demonstrated

`Java` `Selenium WebDriver` `TestNG` `Maven` `POM` `DataProvider` `Manual Testing` `Git` `GitHub`
