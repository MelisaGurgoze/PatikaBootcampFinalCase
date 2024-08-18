package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SignupPage;

import java.net.MalformedURLException;
import java.net.URL;
public class SignupTest {
    static AppiumDriver driver;

    SignupPage signupPage;

    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
    @When("User makes registration by filling fields")
    public void userMakesRegistrationByFillingFields() {
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
        signupPage = new SignupPage();
        signupPage.fillFirstName("name",driver);
        signupPage.fillSurname("surname",driver);
        signupPage.fillEmail("email",driver);
        signupPage.fillPassword("password",driver);
        signupPage.fillIdentityNumber("identityNumber",driver);
        signupPage.fillPhoneNumber("phoneNumber",driver);


    }

    @Then("User registers successfully")
    public void userRegistersSuccessfully() {
        signupPage = new SignupPage();
    }
}
