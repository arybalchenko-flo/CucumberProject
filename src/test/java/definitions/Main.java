package definitions;

import Base.Base;
import Pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.WebDriverFactory;

import java.io.File;

import static variables.Variables.requiredExtension;

public class Main extends Base {
    MainPage main = new MainPage();
    private String fileName; //переменная для имени файла

    @Given("I click on the download button")
    public void iClickOnTheDownloadButton() {
        main.clickDownload();
    }

    @Then("I wait until download is finished")
    public void iWaitUntilDownloadIsFinished() throws InterruptedException {
        Thread.sleep(5000); //ожидание 5 секунд
    }

    @And("File with filename {string} downloaded")
    public void fileWithFilenameDownloaded(String fileName) {
        this.fileName = fileName; //Назначение имени файла
    }

    @Then("I check file availability")
    public void iCheckFileAvailability() {
        String path = WebDriverFactory.downloadDir + "//" + this.fileName; // Путь к файлу
        String extension = ""; //Создание переменной
        File f = new File(path);
        if (path.contains("."))
            extension = path.substring(path.lastIndexOf(".")); //присваивает расширение файла переменной
        long size = f.length();
        if (f.isFile() & size > 1500000 & extension.equals(requiredExtension)) { //проверка на наличие файла, размер файла и расширение файла
            System.out.println("File exist and have size " + size + " and correct extension " + extension);
        }
        else {
            System.out.println("File check failed");
        }
    }
}
