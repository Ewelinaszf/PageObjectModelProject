package testcases;

import crm.CRMHomePage;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;
import pages.accounts.AccountsPage;
import pages.accounts.CreateAccountPage;
import utilities.Utilities;

import java.util.Hashtable;

import static base.Page.menu;

public class CreateAccountTest extends BaseTest {


    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void createAccountTest(Hashtable<String, String> data) throws InterruptedException {

        ZohoAppPage zohoAppPage = new ZohoAppPage();
        CRMHomePage crmHomePage = zohoAppPage.goToCRM();
        AccountsPage accountsPage = menu.gotoAccounts();
        CreateAccountPage cap = accountsPage.goToCreateAccounts();
        cap.createAccount(data.get("accountname"));

    }
}


