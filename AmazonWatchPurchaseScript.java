import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWatchPurchaseScript {
    public static void main(String[] args) throws InterruptedException {
    	 // Set the path to the ChromeDriver executable
   	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
       // Go to Amazon.in
       driver.get("https://www.amazon.in");
       Thread.sleep(2000);
        // Search for watches
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("watches");
        searchBox.submit();
        
        // Select the first search result
        WebElement firstResult = driver.findElement(By.cssSelector("div[data-index='0']"));
        firstResult.click();
        
        // Add the item to the cart
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();
        
      
        // Proceed to checkout
        WebElement proceedToCheckoutButton = driver.findElement(By.id("hlb-ptc-btn-native"));
        proceedToCheckoutButton.click();
        
        // Sign in to your Amazon account (if required)
        // Add your code here to handle the sign-in process if needed
        
        // Fill in the shipping address details
        WebElement addressField = driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
        addressField.sendKeys("Your Name");
        
        // Add your code to fill in other address details
        
        // Continue to payment
        WebElement continueToPaymentButton = driver.findElement(By.name("shipToThisAddress"));
        continueToPaymentButton.click();
        
        // Fill in the payment details
        WebElement cardNumberField = driver.findElement(By.id("creditCardNumber"));
        cardNumberField.sendKeys("Your Card Number");
        
        // Add your code to fill in other payment details
        
        // Place the order
        WebElement placeOrderButton = driver.findElement(By.id("placeYourOrder"));
        placeOrderButton.click();
        
        // Close the browser
        driver.quit();
    }
}