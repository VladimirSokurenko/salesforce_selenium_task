package pageObject;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataExplorerPage {

    WebDriver driver;

    public DataExplorerPage(WebDriver driver){ this.driver = driver; }

    String lastUsedAppFile = "//tr[9]//td[3]";
    String solutionsFile = "//tr[8]//td[3]";
    String accountsFile = "//tr[7]//td[3]";
    String compaignsFile = "//tr[6]//td[3]";
    String contactsFile = "//tr[5]//td[3]";
    String exportSelectionButton = "export_selection_btn";

    public void selectLastUsedAppFile(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(lastUsedAppFile))))
                .click();
    }

    public void selectSolutionsFile(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(solutionsFile))))
                .click();
    }

    public void selectAccountsFile(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(accountsFile))))
                .click();
    }

    public void selectCompaignsFile(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(compaignsFile))))
                .click();
    }

    public void selectContactsFile(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(contactsFile))))
                .click();
    }

    public void clickExportSelectionButton(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(exportSelectionButton))))
                .click();
    }
}
