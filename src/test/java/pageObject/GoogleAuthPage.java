package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleAuthPage {

    WebDriver driver;

    public GoogleAuthPage(WebDriver driver){ this.driver = driver; }

    String emailField = "identifierId";
    String nextButton = "identifierNext";
    String passwordField = "password";
    String passwordNextButton = "passwordNext";
    String allowDriveAccessButton = "//div[@id='submit_approve_access']";

    public void fillEmailFiled(String email){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(emailField))))
                .sendKeys(email);
    }

    public void clickNextButton(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(nextButton))))
                .click();
    }

    public void fillPasswordFiled(String password){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(passwordField))))
                .sendKeys(password);
    }

    public void clickPasswordNextButton(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(passwordNextButton))))
                .click();
    }

    public void clickAllowDriveAccessButton(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allowDriveAccessButton)))
                .click();
    }


}
