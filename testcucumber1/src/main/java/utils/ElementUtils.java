package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ElementUtils  {

    private WebDriver driver;
    public ElementUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void onClick(By by){
        driver.findElement(by).click();
    }

    public void fill(By by,String value){
        driver.findElement(by).sendKeys(value);
    }

    public boolean visibilityOfElement(By by) {
        Wait<WebDriver> wait = new FluentWait<>(driver).
                withTimeout(ofSeconds(100)).
                pollingEvery(ofMillis(500)).
                ignoring(NotFoundException.class).ignoring(NoSuchElementException.class);
        try {
            wait.until(visibilityOfElementLocated(by));
            return true;
        } catch (WebDriverException wde) {
            return false;
        }
    }

    public void waitForPageToCompleteState(WebDriver driver) {
        int counter = 0;
        int maxNoOfRetries = 15;
        while (counter != maxNoOfRetries) {
            try {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                if (js.executeScript("return document.readyState").toString().equals("complete")) {
                    break;
                }
                wait(2000);
            } catch (Exception e) {

                System.out.println("No success!");
            }
            counter++;
        }
    }
}
