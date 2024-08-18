package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.By;

public class LoginTest {

    static AppiumDriver driver;

    @Given("User opens Quick Rent App")
    public void userOpensQuickRentApp() {
        public void userOpensQuickRentApp() {
            BaseOptions options = new BaseOptions()
                    .amend("platformName", "Android")
                    .amend("appium:deviceName", "Pixel 6")
                    .amend("appium:automationName", "UiAutomator2")
                    .amend("appium:udid", "Android Emulator")
                    .amend("appium:avd", "Pixel_6_Pro_API_32")
                    .amend("appium:fastReset", true)
                    .amend("appium:newCommandTimeout", 5)
                    .amend("appium:ensureWebviewsHavePages", true)
                    .amend("appium:nativeWebScreenshot", true)
                    .amend("appium:connectHardwareKeyboard", true)
                    .amend("appium:app", "/Users/melisagurgoze/Desktop/appiumapk/selendroid-test-app.apk");


            driver = new AndroidDriver(this.getUrl(), options);
        }


    }



    @When("User fills  email address as{string}")
    public void userFillsEmailAddressAs(String email ) {
        driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys(email);
    }

    @When("User fills password ad {string}")
    public void userFillsPasswordAd(String password) {
        driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys(password);
    }


    @When("User clicks login button")
    public void userClicksLoginButton() {
        driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).click();
    }

    @Then("Redirect to home page")
    public void redirectToHomePage() {
    }


}