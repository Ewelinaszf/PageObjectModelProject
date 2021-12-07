package pages;

import base.Page;
import crm.CRMHomePage;
import org.openqa.selenium.By;

public class ZohoAppPage extends Page {


    public void goToChat() {
        click("accountstab_XPATH");
    }
    public CRMHomePage goToCRM() throws InterruptedException {
        click("backToApp_ID");
        Thread.sleep(3000);
        click("crmlink_XPATH");
        return new CRMHomePage();
    }

    public void goToSalesIQ() {
    }
}

