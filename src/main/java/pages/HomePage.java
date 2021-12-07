package pages;

import base.Page;
import org.openqa.selenium.By;


public class HomePage extends Page {



    public void goToSupport() {
        driver.findElement(By.cssSelector(".signing>a:nth-child(2)")).click();

    }


    public void goToSignUp() {
        driver.findElement(By.xpath("//a[contains(@class,'zh-signup')]")).click();

    }

    public LoginPage goToLogin() {
        click("loginlink_XPATH");
       // driver.findElement(By.xpath("//a[contains(@class,'zh-login')]")).click();
        return new LoginPage();
    }

    public void goToZoho() {
    }

    public void goLoLearnMore() {
    }

    public void validateFooterLinks() {

    }
}
