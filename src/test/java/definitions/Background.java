package definitions;

import Base.Base;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background extends Base {
    @Given("I open the main page")
    public void i_Open_The_Main_Page() {
        Hooks.openSite();
    }

    @Then("Page opened")
    public void page_Opened() {
        System.out.println("Page opened successfully");
    }
}
