package definitions;

import Base.Base;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Background extends Base {
    @Given("I open the main page")
    public void i_Open_The_Main_Page() {
        Hooks.openSite();
    }

    @Then("Search completed")
    public void search_Completed() {
        System.out.println("Search completed");
    }

    @Then("Page opened")
    public void page_Opened() {
        System.out.println("Page opened successfully");
    }

    @And("I wait three sec")
    public void i_Wait_Three_Sec() throws InterruptedException {
        Thread.sleep(3000);
    }
}
