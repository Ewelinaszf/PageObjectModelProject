//package rough;
//
//import crm.CRMHomePage;
//import pages.HomePage;
//import pages.LoginPage;
//import base.Page;
//import pages.ZohoAppPage;
//import pages.accounts.AccountsPage;
//import pages.accounts.CreateAccountPage;
//
//public class LoginTest extends Page {
//
//    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(2000);
//        HomePage homePage = new HomePage();
//        LoginPage loginPage = homePage.goToLogin();
//        ZohoAppPage zohoAppPage = loginPage.doLogin("ewelinaszymaniak@gmail.com", "Pi=3.1415");
//        CRMHomePage crmHomePage = zohoAppPage.goToCRM();
//        AccountsPage accountsPage  = menu.gotoAccounts();
//        CreateAccountPage cap = accountsPage.goToCreateAccounts();
//        cap.createAccount("Roman");
//
//    }
//}
