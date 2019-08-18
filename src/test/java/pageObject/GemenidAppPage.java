package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GemenidAppPage {

    WebDriver driver;

    public GemenidAppPage(WebDriver driver){ this.driver = driver; }

    String dataExplorerBlock = "//div[@class='page-content-wrapper']//div[2]//a[1]//img[1]";


    public void clickDataExplorerBlock(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(dataExplorerBlock))))
                .click();
    }



}
