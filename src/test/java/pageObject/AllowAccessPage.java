package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllowAccessPage {

    WebDriver driver;

    public AllowAccessPage(WebDriver driver){ this.driver = driver; }

    String allowButton = "oaapprove";

    public void clickAllowButton(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(allowButton))))
                .click();
    }

}
