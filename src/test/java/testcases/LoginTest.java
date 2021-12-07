package testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;
import utilities.Utilities;

import java.util.Hashtable;

public class LoginTest extends BaseTest {

    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void loginTest(Hashtable<String, String> data) throws InterruptedException {
        HomePage homePage = new HomePage();
        Thread.sleep(3000);
        LoginPage loginPage = homePage.goToLogin();
        ZohoAppPage zohoAppPage = loginPage.doLogin(data.get("username"), data.get("password"));
        Thread.sleep(3000);
    }
}
