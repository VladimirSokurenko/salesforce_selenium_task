package pageObject;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DataExplorerExportPage {

    WebDriver driver;

    public DataExplorerExportPage(WebDriver driver){ this.driver = driver; }

    String googleButton = "google_auth_btn";
    String googleRadioButton = "//span[2]//div[1]//i[1]";
    String folderNameField = "//input[@placeholder='Enter Folder Name']";
    String submitButton = "submit_btn";
    String okModalButton = "//button[@class='btn btn-main']";

    public void clickGoogleButton(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(googleButton))))
                .click();
    }

    public void clickGoogleRadioButton(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement googleRadioBtn = driver.findElement(By.xpath(googleRadioButton));
        wait.until(ExpectedConditions.visibilityOf(googleRadioBtn))
                .click();
        Assert.assertTrue(googleRadioBtn.isEnabled());
    }

    public void changeFolderName(String name){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement folderField = driver.findElement(By.xpath(folderNameField));
        wait.until(ExpectedConditions.visibilityOf(folderField))
                .clear();
        wait.until(ExpectedConditions.visibilityOf(folderField))
                .sendKeys(name);
    }

    public void clickSubmitButton(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(submitButton))))
                .click();
    }

    public void clickOkModalButton(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(okModalButton))))
                .click();
    }
}
