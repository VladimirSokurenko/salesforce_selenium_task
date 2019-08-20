package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataExplorerPage {

    WebDriver driver;

    public DataExplorerPage(WebDriver driver){ this.driver = driver; }

    public void selectLastUsedAppFile(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))))
                .click();
    }

    public void selectSolutionsFile(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))))
                .click();
    }

    public void selectAccountsFile(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))))
                .click();
    }

    public void selectCampaignsFile(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))))
                .click();
    }

    public void selectContactsFile(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))))
                .click();
    }

    public void clickExportSelectionButton(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))))
                .click();
    }
}
