package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;

public class WebDriverFactory {
    public static WebDriver getDriver(Browsers browserType) {
        WebDriver driver = null;
        switch (browserType) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
                chromePrefs.put("download.default_directory", "//Users//floadmin//Documents//DownloadTest");
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("prefs", chromePrefs);
                driver = new ChromeDriver(options);
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case CHROME_CLEAR:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default:
                break;
        }
        return driver;
    }
}
