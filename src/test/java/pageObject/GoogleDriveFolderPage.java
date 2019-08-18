package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Date;

public class GoogleDriveFolderPage {

    WebDriver driver;

    public GoogleDriveFolderPage(WebDriver driver){ this.driver = driver; }

    public boolean verifyFilePresent(String locator){
        try {
            driver.findElement(By.xpath(locator));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void switchToNewWindow(){
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }

    public void checkAccountDocumentUploaded(){
        switchToNewWindow();
        Date date = new Date();
        long currentTime = date.getTime();
        final int TIMEOUT = 15000;
        long targetTime = currentTime + TIMEOUT;
        while(currentTime < targetTime) {
            if (verifyFilePresent("//div[text()='Account.zip']")) {
                break;
            } else {
                driver.navigate().refresh();
            }
        }
    }
}
