#  SauceDemo Automation - TestNG + Selenium

This repository contains an end-to-end automation script for [SauceDemo](https://www.saucedemo.com/) using **Java**, **Selenium WebDriver**, and **TestNG**.

---

##  Features

-  Login using standard user credentials
-  Add first product to the cart
-  Complete checkout with mock user data
-  Validations using assertions
-  ChromeDriver setup with clean teardown

---

## Project Structure
src/
└── main/
└── java/
└── org/example/
└── SauceAutomation.java # Complete test flow




---

## Tools & Technologies

- Java 11+
- Gradle
- TestNG
- Selenium WebDriver
- Google Chrome (latest) + ChromeDriver

---

##  How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/saucedemo-testng-selenium.git
cd saucedemo-testng-selenium

Implement the dependencies 




 ##Test Flow
Login

User: standard_user

Password: secret_sauce

Add to Cart

Adds the first visible product to the cart

Verifies it using product name comparison

Checkout

Fills first name, last name, and zip

Clicks Finish to complete the flow

