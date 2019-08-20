package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GemenidAppPage {

    WebDriver driver;

    public GemenidAppPage(WebDriver driver){ this.driver = driver; }

    public void clickDataExplorerBlock(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))))
                .click();
    }

}
