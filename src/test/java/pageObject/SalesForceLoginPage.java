package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesForceLoginPage {

    WebDriver driver;

    public SalesForceLoginPage(WebDriver driver){ this.driver = driver; }

    String salesForceLoginButton = "Login";
    String usernameField = "username";
    String passwordFiled = "password";

    public void checkUsernameField(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(usernameField))));
    }

    public void fillInUsernameField(String username){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(usernameField))))
                .sendKeys(username);
    }

    public void fillInPasswordField(String password){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(passwordFiled))))
                .sendKeys(password);
    }

    public void clickLoginButton(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(salesForceLoginButton))))
                .click();
    }





}
