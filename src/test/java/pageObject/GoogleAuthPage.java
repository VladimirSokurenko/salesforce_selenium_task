package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleAuthPage {

    WebDriver driver;

    public GoogleAuthPage(WebDriver driver){ this.driver = driver; }

    public void fillEmailFiled(String email, String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))))
                .sendKeys(email);
    }

    public void clickNextButton(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))))
                .click();
    }

    public void fillPasswordFiled(String password,String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(locator))))
                .sendKeys(password);
    }

    public void clickPasswordNextButton(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))))
                .click();
    }

    public void clickAllowDriveAccessButton(String locator) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, 15);
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)))
                .click();
    }


}
