package integrationTests;

import com.github.javafaker.Faker;
import csvFileReader.CsvFileReader;
import org.testng.annotations.Test;
import pageObject.*;
import webDriverSetUp.WebDriverSetUp;

import java.io.IOException;
import java.util.HashMap;


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

    CsvFileReader csvFileReader = new CsvFileReader();

    final static String BASE_URL = "https://www.geminidsystems.com";

    @Test(description = "Import 5 tables to google drive")
    public void importTablesToGoogleDrive() throws Exception {
        HashMap<String,String> testData = csvFileReader.getTestData();

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
        homePage.verifyLogo(testData.get("homepage logo"));
        homePage.clickLoginButton(testData.get("login button"));
        homePage.clickProductionInstance(testData.get("production button"));
        salesForceLoginPage.checkUsernameField(testData.get("username field"));
        salesForceLoginPage.fillInUsernameField(testData.get("username"), testData.get("username field"));
        salesForceLoginPage.fillInPasswordField(testData.get("password"), testData.get("password field"));
        salesForceLoginPage.clickLoginButton(testData.get("logIn button"));
        allowAccessPage.clickAllowButton(testData.get("approve button"));
        gemenidAppPage.clickDataExplorerBlock(testData.get("data explorer block"));
        dataExplorerPage.selectLastUsedAppFile(testData.get("last used app"));
        dataExplorerPage.selectSolutionsFile(testData.get("solutions"));
        dataExplorerPage.selectAccountsFile(testData.get("accounts"));
        dataExplorerPage.selectCampaignsFile(testData.get("campaigns"));
        dataExplorerPage.selectContactsFile(testData.get("contacts"));
        dataExplorerPage.clickExportSelectionButton(testData.get("export selections button"));
        dataExplorerExportPage.clickGoogleButton(testData.get("google button"));
        googleAuthPage.fillEmailFiled(testData.get("email"), testData.get("email field"));
        googleAuthPage.clickNextButton(testData.get("next button"));
        googleAuthPage.fillPasswordFiled(testData.get("email password"), testData.get("email password filed"));
        googleAuthPage.clickPasswordNextButton(testData.get("finish button"));
        googleAuthPage.clickAllowDriveAccessButton(testData.get("allow access button"));
        dataExplorerExportPage.clickGoogleRadioButton(testData.get("radio button google"));
        dataExplorerExportPage.changeFolderName(folderNameText, testData.get("folder name field"));
        dataExplorerExportPage.clickSubmitButton(testData.get("submit button"));
        dataExplorerExportPage.clickOkModalButton(testData.get("OK modal button"));
        dataExplorerSubmittedPage.clickViewFilesButton(testData.get("view files button"));
        dataExplorerSubmittedPage.clickGoToMyFolderButton(testData.get("go to folder button"));
        googleDriveFolderPage.switchToGoogleDriveWindow();
        googleDriveFolderPage.checkAccountDocumentUploaded(testData.get("accounts file"));
        googleDriveFolderPage.checkCampaignDocumentUploaded(testData.get("campaign file"));
        googleDriveFolderPage.checkContactDocumentUploaded(testData.get("contacts file"));
        googleDriveFolderPage.checkSolutionDocumentUploaded(testData.get("solutions file"));
        googleDriveFolderPage.checkUserAppInfoDocumentUploaded(testData.get("last used app file"));
    }
}
