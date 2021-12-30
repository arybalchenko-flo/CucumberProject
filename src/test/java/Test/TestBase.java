//package Test;
//
//import Base.Base;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import variables.Variables;
//
//import java.time.Duration;
//
//public class TestBase extends Base {
//
//    public static void beginning() {
//        WebDriverManager.chromedriver().setup();
//        driver.manage().window().maximize(); // фуллскрин
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //задержка
//    }
//
//    public static void openSite() {
//        driver.get(Variables.site); //открыть сайт;
//    }
//
//    public static void ending() {
//        driver.quit();
//        System.out.println("Test completed successfully");
//    }
//
//}
