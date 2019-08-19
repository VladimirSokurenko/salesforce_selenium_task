package pageObject;

import com.opencsv.CSVReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;

public class HomePage {

    WebDriver driver;



    public HomePage(WebDriver driver){ this.driver = driver; }

    String headerLogo = "logo";
    String loginButton = "login_button";
    String productionInstance = "//button[contains(text(),'PRODUCTION')]";

    public void verifyLogo(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(headerLogo))));
    }

    public void clickLoginButton(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(loginButton))))
                .click();

    }

    public void clickProductionInstance(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(productionInstance))))
                .click();
    }

}
