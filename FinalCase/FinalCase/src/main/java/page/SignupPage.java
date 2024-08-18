package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {

    public final By nameloc = By.id("");
    public final By surnameloc = By.id("");
    public final By emailloc = By.id("");
    public final By passwordloc = By.id("");
    public final By identityNumberloc = By.id("");
    public final By phoneNumberloc = By.id("");

    private WebElement nameElement(WebDriver driver){
        WebElement name = driver.findElement(nameloc);
        return name;
    }

    private WebElement surnameElement(WebDriver driver){
        WebElement surname = driver.findElement(surnameloc);
        return surname;
    }

    private WebElement emailElement(WebDriver driver){
        WebElement email = driver.findElement(emailloc);
        return email;
    }

    private WebElement passwordElement(WebDriver driver){
        WebElement password = driver.findElement(passwordloc);
        return password;
    }
    private WebElement identityNumberElement(WebDriver driver){
        WebElement identityNumber = driver.findElement(identityNumberloc);
        return identityNumber;
    }
    private WebElement phoneNumberElement(WebDriver driver){
        WebElement phoneNumber = driver.findElement(phoneNumberloc);
        return phoneNumber;
    }

    public void fillFirstName(String name, WebDriver driver) {
        nameElement(driver).sendKeys(name);
    }
    public void fillSurname(String surname, WebDriver driver) {
        surnameElement(driver).sendKeys(surname);
    }
    public void fillEmail(String email, WebDriver driver) {
        emailElement(driver).sendKeys(email);
    }
    public void fillPassword(String password, WebDriver driver) {
        passwordElement(driver).sendKeys(password);
    }
    public void fillIdentityNumber(String identityNumber, WebDriver driver) {
        identityNumberElement(driver).sendKeys(identityNumber);
    }
    public void fillPhoneNumber(String phoneNumber, WebDriver driver) {
        phoneNumberElement(driver).sendKeys(phoneNumber);
    }

}
