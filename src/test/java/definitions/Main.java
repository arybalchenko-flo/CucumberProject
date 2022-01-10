package definitions;

import Base.Base;
import Pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.WebDriverFactory;

import java.io.File;

public class Main extends Base {
    MainPage main = new MainPage();


    @When("I click on the download button")
    public void iClickOnTheDownloadButton() {
        main.clickDownload();
    }

    @Then("I wait until download is finished")
    public void iWaitUntilDownloadIsFinished() throws InterruptedException {
        Thread.sleep(5000); //ожидание пока файл скачается
    }

    @Given("File downloaded")
    public void fileDownloaded() {
        System.out.println("File downloaded, start checking file");
    }

    @Then("I check file availability")
    public void iCheckFileAvailability() {
        File f = new File(WebDriverFactory.downloadDir + "//pexels-nguyen-duc-10757932.jpg");
        long size = f.length();
        if (f.isFile() & size>1500000) {
            System.out.println("File exist and have correct size and correct extension");
        }
        else {
            System.out.println("File check failed");
        }
    }
}
