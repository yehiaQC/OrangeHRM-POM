package Pages;

import Locators.LoginLocators;
import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Baseclass {

    @Test (priority = 1)
    public void FailedLoginInvalidUsernameorPassword(){
        LoginLocators.logindata();
        LoginLocators.username.sendKeys("wrong");
        LoginLocators.password.sendKeys("wrong");
        LoginLocators.Button.click();
        LoginLocators.wrongdata();

        Assert.assertEquals(LoginLocators.failtext.getText(), "Invalid credentials");
        System.out.println("Invalid credentials");
    }

    @Test (priority = 2)
    public void FailedLoginMissingData(){
        LoginLocators.logindata();
        LoginLocators.username.clear();
        LoginLocators.password.clear();
        LoginLocators.Button.click();
        LoginLocators.MissingUserName();

        Assert.assertEquals(LoginLocators.requiredfield.getText(), "Required");
        System.out.println("Required username");

        Assert.assertEquals(LoginLocators.requiredfield.getText(), "Required");
        System.out.println("Required password");
    }


    @Test (priority = 3)
    public  void Successfulllogin()
    {
        LoginLocators.logindata();
        LoginLocators.password.clear();
        LoginLocators.username.sendKeys("Admin");
        LoginLocators.password.sendKeys("admin123");
        LoginLocators.Button.click();
        Shutterbug.shootPage(driver, Capture.FULL,true).save("C://Users/yahmed/IdeaProjects/OrangeHRM/src/test/resources/afterlogin.png");
    }

}
