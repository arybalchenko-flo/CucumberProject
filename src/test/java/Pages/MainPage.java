package Pages;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends Base {
  //Поле для поиска
    By searchBar = By.className("input__field");
  //Начало поиска
    public void search(String keysToSend) {
        sendKey(searchBar, keysToSend);
    }
}
