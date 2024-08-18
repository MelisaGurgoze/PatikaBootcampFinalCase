package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


public class LogoutTest {
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

    @When("User clicks logout button")
    public void userClicksLogoutButton() {
        driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).click();
    }
}
