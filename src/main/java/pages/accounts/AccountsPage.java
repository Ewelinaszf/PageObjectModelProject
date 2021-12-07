package pages.accounts;

import base.Page;
import base.TopMenu;
import org.openqa.selenium.By;

public class AccountsPage extends Page {


    public CreateAccountPage goToCreateAccounts() {
        click("createaccount_XPATH");
        return new CreateAccountPage();
    }

    public void goToImportsAccounts() {

    }
}
