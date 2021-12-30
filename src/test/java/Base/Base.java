package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base
{
protected static WebDriver driver;
public long waiting_time = 25;
public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waiting_time)); //Настройка ожидания

    public void click(By input_locator) { //нахождение элемента и клик по нему{
        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(input_locator));
        input.click();
    }
    public void sendKey(By key_locator, String keysToSend) { //нахождение элемента и отправка текста
        WebElement sendKey = wait.until(ExpectedConditions.elementToBeClickable(key_locator));
        sendKey.sendKeys(keysToSend);
    }
    public void find(By locator) { //нахождение элемента
        driver.findElement(locator);
    }
}
