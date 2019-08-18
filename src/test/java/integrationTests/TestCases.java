package integrationTests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pageObject.*;
import webDriverSetUp.WebDriverSetUp;


public class TestCases extends WebDriverSetUp {

    /** this class describes test cases
     * Test-case 1: 'Import 5 tables to google drive'
     * steps:
     * 1. open 'geminid' application
     * 2. check if application opened
     * 3. click 'LOGIN' button
     * 4. click 'PRODUCTION' button
     */

    Faker faker = new Faker();
    String folderNameText = faker.firstName();


    final static String BASE_URL = "https://www.geminidsystems.com";
    final static String USERNAME = "vaguard@van.com";
    final static String PASSWORD = "123123qwe";
    final static String EMAIL = "userwantwtorenttwo@gmail.com";
    final static String EMAIL_PASSWORD = "12345qwe";


    @Test(description = "Import 5 tables to google drive")
    public void importTablesToGoogleDrive(){
        HomePage homePage = new HomePage(driver);
        SalesForceLoginPage salesForceLoginPage = new SalesForceLoginPage(driver);
        AllowAccessPage allowAccessPage = new AllowAccessPage(driver);
        GemenidAppPage gemenidAppPage = new GemenidAppPage(driver);
        DataExplorerPage dataExplorerPage = new DataExplorerPage(driver);
        DataExplorerExportPage dataExplorerExportPage = new DataExplorerExportPage(driver);
        GoogleAuthPage googleAuthPage = new GoogleAuthPage(driver);
        DataExplorerSubmittedPage dataExplorerSubmittedPage = new DataExplorerSubmittedPage(driver);
        GoogleDriveFolderPage googleDriveFolderPage = new GoogleDriveFolderPage(driver);

        openApplication(BASE_URL);
        homePage.verifyLogo();
        homePage.clickLoginButton();
        homePage.clickProductionInstance();
        salesForceLoginPage.checkUsernameField();
        salesForceLoginPage.fillInUsernameField(USERNAME);
        salesForceLoginPage.fillInPasswordField(PASSWORD);
        salesForceLoginPage.clickLoginButton();
        allowAccessPage.clickAllowButton();
        gemenidAppPage.clickDataExplorerBlock();
        dataExplorerPage.selectLastUsedAppFile();
        dataExplorerPage.selectSolutionsFile();
        dataExplorerPage.selectAccountsFile();
        dataExplorerPage.selectCompaignsFile();
        dataExplorerPage.selectContactsFile();
        dataExplorerPage.clickExportSelectionButton();
        dataExplorerExportPage.clickGoogleButton();
        googleAuthPage.fillEmailFiled(EMAIL);
        googleAuthPage.clickNextButton();
        googleAuthPage.fillPasswordFiled(EMAIL_PASSWORD);
        googleAuthPage.clickPasswordNextButton();
        googleAuthPage.clickAllowDriveAccessButton();
        dataExplorerExportPage.clickGoogleRadioButton();
        dataExplorerExportPage.changeFolderName(folderNameText);
        dataExplorerExportPage.clickSubmitButton();
        dataExplorerExportPage.clickOkModalButton();
        dataExplorerSubmittedPage.clickViewFilesButton();
        dataExplorerSubmittedPage.clickGoToMyFolderButton();
        googleDriveFolderPage.checkAccountDocumentUploaded();

    }
}
