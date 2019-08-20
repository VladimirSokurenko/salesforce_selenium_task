package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataExplorerSubmittedPage {

    WebDriver driver;

    public DataExplorerSubmittedPage(WebDriver driver){ this.driver=driver; }

    public void clickViewFilesButton(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))))
                .click();
    }

    public void clickGoToMyFolderButton(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))))
                .click();
    }
}
