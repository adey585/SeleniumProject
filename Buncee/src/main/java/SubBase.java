import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import pageobject.AccountPage;
import pageobject.AddAddress;

import java.io.IOException;

public class SubBase extends Base {
    //Field
    public static String testDataFilePath = "C:\\Users\\iamam\\IdeaProjects\\Amazon\\Buncee\\src\\test\\TestData\\Test.xlsx";

    //Test Data
    public String userName = readFromExcel(testDataFilePath, "Account", "B2");
    public String password = readFromExcel(testDataFilePath, "Account", "C2");
    public String addEmailAddress = readFromExcel(testDataFilePath, "AddressList", "A2");
    public String addFirstName = readFromExcel(testDataFilePath, "AddressList", "B2");
    public String addLastName = readFromExcel(testDataFilePath, "AddressList", "C2");

    public SubBase() throws IOException {
    }

    public void loginToAccount() throws InterruptedException {
        clickByXPath(AccountPage.loginLinkXPath);
        sendTextByXpath(AccountPage.userNameFiledXPath, userName);
        sendTextByXpath(AccountPage.passwordFieldXPath, password);
        clickByXPath(AccountPage.loginButtonXPath);
        clickByXPath(AccountPage.profileLogoXPath);
        clickByXPath(AccountPage.profileLogoXPath);
    }

    public void logOutFromAccount() throws InterruptedException {
        clickByXPath(AccountPage.profileLogoXPath);
        clickByXPath(AccountPage.logoutLinkXPath);
    }

    public void addAddressTo() throws InterruptedException {
//        clickByXPath(AccountPage.loginLinkXPath);
//        sendTextByXpath(AccountPage.userNameFiledXPath, userName);
//        sendTextByXpath(AccountPage.passwordFieldXPath, password);
//        clickByXPath(AccountPage.loginButtonXPath);
        clickByXPath(AccountPage.profileLogoXPath);
        clickByXPath(AddAddress.addressLinkXPath);
        sendTextByXpath(AddAddress.emailAddressFieldXPath, addEmailAddress);
        sendTextByXpath(AddAddress.firstNameFieldXPath, addFirstName);
        sendTextByXpath(AddAddress.lastNameFieldXPath, addLastName);
        clickByXPath(AddAddress.addPlusLinkXPath);
        clickByXPath(AccountPage.profileLogoXPath);
        clickByXPath(AccountPage.logoutLinkXPath);
    }
}
