package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DataExplorerExportPage {

    WebDriver driver;

    public DataExplorerExportPage(WebDriver driver){ this.driver = driver; }

    public void clickGoogleButton(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))))
                .click();
    }

    public void clickGoogleRadioButton(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement googleRadioBtn = driver.findElement(By.xpath(locator));
        wait.until(ExpectedConditions.visibilityOf(googleRadioBtn))
                .click();
        Assert.assertTrue(googleRadioBtn.isEnabled());
    }

    public void changeFolderName(String name, String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement folderField = driver.findElement(By.xpath(locator));
        wait.until(ExpectedConditions.visibilityOf(folderField))
                .clear();
        wait.until(ExpectedConditions.visibilityOf(folderField))
                .sendKeys(name);
    }

    public void clickSubmitButton(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))))
                .click();
    }

    public void clickOkModalButton(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))))
                .click();
    }
}
