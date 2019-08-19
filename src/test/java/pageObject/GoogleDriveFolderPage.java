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

    String accountFile = "//div[text()='Account.zip']";
    String campaignFile = "//div[text()='Campaign.zip']";
    String contactFile = "//div[text()='Contact.zip']";
    String solutionFile = "//div[text()='Solution.zip']";
    String userAppInfoFile = "//div[text()='UserAppInfo.zip']";



    public boolean verifyFilePresent(String locator){
        try {
            driver.findElement(By.xpath(locator));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void switchToGoogleDriveWindow(){
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }

    public void checkAccountDocumentUploaded(){
       // switchToNewWindow();
        Date date = new Date();
        long currentTime = date.getTime();
        final int TIMEOUT = 10000;
        long targetTime = currentTime + TIMEOUT;
        while(currentTime < targetTime) {
            if (verifyFilePresent(accountFile)) {
                break;
            } else {
                driver.navigate().refresh();
            }
        }
    }

    public void checkCampaigngDocumentUploaded(){
        //switchToNewWindow();
        Date date = new Date();
        long currentTime = date.getTime();
        final int TIMEOUT = 10000;
        long targetTime = currentTime + TIMEOUT;
        while(currentTime < targetTime) {
            if (verifyFilePresent(campaignFile)) {
                break;
            } else {
                driver.navigate().refresh();
            }
        }
    }

    public void checkContactDocumentUploaded(){
        //switchToNewWindow();
        Date date = new Date();
        long currentTime = date.getTime();
        final int TIMEOUT = 10000;
        long targetTime = currentTime + TIMEOUT;
        while(currentTime < targetTime) {
            if (verifyFilePresent(contactFile)) {
                break;
            } else {
                driver.navigate().refresh();
            }
        }
    }

    public void checkSolutionDocumentUploaded(){
        //switchToNewWindow();
        Date date = new Date();
        long currentTime = date.getTime();
        final int TIMEOUT = 10000;
        long targetTime = currentTime + TIMEOUT;
        while(currentTime < targetTime) {
            if (verifyFilePresent(solutionFile)) {
                break;
            } else {
                driver.navigate().refresh();
            }
        }
    }

    public void checkUserAppInfoDocumentUploaded(){
        //switchToNewWindow();
        Date date = new Date();
        long currentTime = date.getTime();
        final int TIMEOUT = 10000;
        long targetTime = currentTime + TIMEOUT;
        while(currentTime < targetTime) {
            if (verifyFilePresent(userAppInfoFile)) {
                break;
            } else {
                driver.navigate().refresh();
            }
        }
    }
}
