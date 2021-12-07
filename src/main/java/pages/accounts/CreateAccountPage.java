package pages.accounts;

import base.Page;
import base.TopMenu;
import org.openqa.selenium.By;

public class CreateAccountPage extends Page {


    public void createAccount(String accountName) {
        type("accountname_CSS", accountName);
    }
}
