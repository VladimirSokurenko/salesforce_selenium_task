package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesForceLoginPage {

    WebDriver driver;

    public SalesForceLoginPage(WebDriver driver){ this.driver = driver; }

    public void checkUsernameField(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))));
    }

    public void fillInUsernameField(String username, String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))))
                .sendKeys(username);
    }

    public void fillInPasswordField(String password, String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))))
                .sendKeys(password);
    }

    public void clickLoginButton(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))))
                .click();
    }





}
