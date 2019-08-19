package webDriverSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebDriverSetUp {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("chromedriver", "/home/alexander/IdeaProjects/salesforce_selenium_test");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void openApplication(String url){ driver.get(url); }


    @AfterMethod
    public void exitBrowser(){
        driver.quit();
    }








}
