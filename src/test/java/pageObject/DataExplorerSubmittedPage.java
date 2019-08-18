package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataExplorerSubmittedPage {

    WebDriver driver;

    public DataExplorerSubmittedPage(WebDriver driver){ this.driver=driver; }

    String viewFilesButton = "//button[@class='btn btn-sm export-button']";
    String goToMyFolderButton = "//button[@class='btn btn-main']";

    public void clickViewFilesButton(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(viewFilesButton))))
                .click();
    }

    public void clickGoToMyFolderButton(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(goToMyFolderButton))))
                .click();
    }
}
