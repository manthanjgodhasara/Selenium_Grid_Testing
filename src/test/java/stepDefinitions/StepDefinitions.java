package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    static RemoteWebDriver driver;

//    static String projectPath = System.getProperty("user.dir");


    public static void setup() throws MalformedURLException {
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setPlatform(Platform.ANY);

        URL hubUrl = new URL("https://admin:admin@shub.k8s.mevijay.dev");
        ChromeOptions options = new ChromeOptions();
        driver = new RemoteWebDriver(hubUrl, options);
    }


    @Given("I open the Google website")
    public void iOpenGoogleWebsite() throws Exception {
        setup();
        driver.get("https://www.google.com");
        Thread.sleep(5000);
    }

    @Given("I open the Bing website")
    public void iOpenBingWebsite() throws InterruptedException, MalformedURLException {
        setup();
        driver.get("https://www.bing.com");
        Thread.sleep(5000);
    }

    @Then("^the title1 should be \"([^\"]*)\"$")
    public void theTitle1ShouldBe(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
        driver.quit();
    }

    @Then("^the title2 should be \"([^\"]*)\"$")
    public void theTitle2ShouldBe(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
        driver.quit();
    }
}
