package integrationTests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pageObject.*;
import webDriverSetUp.WebDriverSetUp;

import java.io.IOException;


public class TestCases extends WebDriverSetUp {

    /** this class describes test cases
     * Test-case 1: 'Import 5 files to google drive'
     * steps:
     * 1. open 'geminid' application
     * 2. check if application opened
     * 3. click 'LOGIN' button
     * 4. click 'PRODUCTION' button
     * 5. fill in login form and click 'Login' button
     * 6. click 'Allow' button
     * 7. click 'Data Explorer' block
     * 8. select five documents
     * 9. import to google drive
     * 10. verify if documents imported
     */

    Faker faker = new Faker();
    String folderNameText = faker.firstName();


    final static String BASE_URL = "https://www.geminidsystems.com";
    final static String USERNAME = "vaguard@van.com";
    final static String PASSWORD = "123123qwe";
    final static String EMAIL = "userwantwtorenttwo@gmail.com";
    final static String EMAIL_PASSWORD = "12345qwe";


    @Test(description = "Import 5 tables to google drive")
    public void importTablesToGoogleDrive() throws InterruptedException {
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
        dataExplorerPage.selectCampaignsFile();
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
        googleDriveFolderPage.switchToGoogleDriveWindow();
        googleDriveFolderPage.checkAccountDocumentUploaded();
        googleDriveFolderPage.checkCampaigngDocumentUploaded();
        googleDriveFolderPage.checkContactDocumentUploaded();
        googleDriveFolderPage.checkSolutionDocumentUploaded();
        googleDriveFolderPage.checkUserAppInfoDocumentUploaded();
    }
}
