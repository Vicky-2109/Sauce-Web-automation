package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SauceAutomation {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test(priority = 1)
    public void loginTest() {
        // Login with standard user
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Verify login
        String url = driver.getCurrentUrl();
        assert url.contains("inventory") : "Login Failed!";
        System.out.println("Logged in successfully.");
    }

    @Test(priority = 2)
    public void addToCartTest() {
        // Add the first product to cart
        WebElement Addcart = driver.findElement(By.cssSelector(".inventory_item button"));
        String productName = driver.findElement(By.cssSelector(".inventory_item_name")).getText();
        Addcart.click();

        driver.findElement(By.className("shopping_cart_link")).click();

        // Check if product is in cart
        String cartItem = driver.findElement(By.className("inventory_item_name")).getText();
        assert cartItem.equals(productName) : "Product not found in cart!";
        System.out.println("Product added to cart: " + cartItem);
    }

    @Test(priority = 3)
    public void completeCheckoutTest() throws InterruptedException {
        // Click checkout
        driver.findElement(By.id("checkout")).click();

        // Fill checkout info
        driver.findElement(By.id("first-name")).sendKeys("Rajesh");
        driver.findElement(By.id("last-name")).sendKeys("Gopal");
        driver.findElement(By.id("postal-code")).sendKeys("45678");
        driver.findElement(By.id("continue")).click();


        // Finish order
        driver.findElement(By.id("finish")).click();

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
