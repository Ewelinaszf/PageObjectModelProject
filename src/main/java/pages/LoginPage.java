package pages;

import base.Page;
import org.openqa.selenium.By;


public class LoginPage extends Page {


    public ZohoAppPage doLogin(String username, String password) throws InterruptedException {
        click("fb_XPATH");

        click("accept_XPATH");
        type("email_ID", username);
        type("password_ID", password);
        click("save_ID");

        return new ZohoAppPage();

    }

    public void goToSalesMarketing() {

    }

    public void goToFinance() {
    }
}
