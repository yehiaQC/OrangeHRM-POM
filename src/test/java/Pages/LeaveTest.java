package Pages;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LeaveTest extends Baseclass{

// assigning leave to employee
@Test(priority = 9)
    public void assignleave() throws InterruptedException {
    Locators.LeaveLocators.locateleavepage();
    Locators.LeaveLocators.leavepagebtn.click();

    Locators.LeaveLocators.assignleavebtnfun();
    Locators.LeaveLocators.assignleavebtn.click();

    Locators.LeaveLocators.Leavelocators();
    Locators.LeaveLocators.EmployeeName.sendKeys("y");
    Thread.sleep(3000);
    action.moveToElement(Locators.LeaveLocators.EmployeeName).keyDown(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

    Locators.LeaveLocators.LeaveType.click();
    Thread.sleep(2000);
    action.moveToElement(Locators.LeaveLocators.LeaveType).keyDown(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

    Locators.LeaveLocators.calendar.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
    Locators.LeaveLocators.calendar.sendKeys("2024-24-11");

    Locators.LeaveLocators.submitbtn.click();
    Locators.LeaveLocators.submitbtn.click();

    Locators.LeaveLocators.aftersubmitbtn();
    Locators.LeaveLocators.approvebtn.click();

}
}

