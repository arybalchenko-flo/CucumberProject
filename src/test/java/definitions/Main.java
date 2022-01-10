package definitions;

import Base.Base;
import Pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Main extends Base {
    MainPage main = new MainPage();

    @When("I move to the photo")
    public void iMoveToThePhoto() {
        main.moveToPhoto();
    }

    @And("I click on the download button")
    public void iClickOnTheDownloadButton() {
        main.downloadClick();
    }

    @Then("I wait until download is finished")
    public void iWaitUntilDownloadIsFinished() throws InterruptedException {
        Thread.sleep(5000); //ожидание пока файл скачается
    }
}
