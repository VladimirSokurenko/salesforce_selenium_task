package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public void switchToGoogleDriveWindow(){
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }

    public void checkAccountDocumentUploaded(String locator){
        Date date = new Date();
        long currentTime = date.getTime();
        final int TIMEOUT = 10000;
        long targetTime = currentTime + TIMEOUT;
        while(currentTime < targetTime) {
            if (verifyFilePresent(locator)) {
                break;
            } else {
                driver.navigate().refresh();
            }
        }
    }

    public void checkCampaignDocumentUploaded(String locator){
        Date date = new Date();
        long currentTime = date.getTime();
        final int TIMEOUT = 10000;
        long targetTime = currentTime + TIMEOUT;
        while(currentTime < targetTime) {
            if (verifyFilePresent(locator)) {
                break;
            } else {
                driver.navigate().refresh();
            }
        }
    }

    public void checkContactDocumentUploaded(String locator){
        Date date = new Date();
        long currentTime = date.getTime();
        final int TIMEOUT = 10000;
        long targetTime = currentTime + TIMEOUT;
        while(currentTime < targetTime) {
            if (verifyFilePresent(locator)) {
                break;
            } else {
                driver.navigate().refresh();
            }
        }
    }

    public void checkSolutionDocumentUploaded(String locator){
        Date date = new Date();
        long currentTime = date.getTime();
        final int TIMEOUT = 10000;
        long targetTime = currentTime + TIMEOUT;
        while(currentTime < targetTime) {
            if (verifyFilePresent(locator)) {
                break;
            } else {
                driver.navigate().refresh();
            }
        }
    }

    public void checkUserAppInfoDocumentUploaded(String locator){
        Date date = new Date();
        long currentTime = date.getTime();
        final int TIMEOUT = 10000;
        long targetTime = currentTime + TIMEOUT;
        while(currentTime < targetTime) {
            if (verifyFilePresent(locator)) {
                break;
            } else {
                driver.navigate().refresh();
            }
        }
    }
}
