package definitions;

import Base.Base;
import Pages.MainPage;
import io.cucumber.java.en.When;
import variables.Variables;

public class Main extends Base {
    MainPage main = new MainPage();

    @When("I send keys to the search")
    public void i_Send_Keys_To_The_Search() {
        main.search(Variables.keysToSend);
    }
}
