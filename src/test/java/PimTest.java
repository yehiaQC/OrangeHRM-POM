import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PimTest extends Baseclass {
/*

    @Test(priority = 4)
    // Open PIM tab in new tab and switch to the new tab, open add employee page
    public  void PImTestaddempyee() {
        PimLocators.locatepimpage();
        action.keyDown(Keys.CONTROL).moveToElement(PimLocators.pimlocator).click().perform();

        for (String wh : driver.getWindowHandles()) {
            driver.switchTo().window(wh);
            if (driver.getCurrentUrl().contains("viewEmployeeList")) {
                driver.switchTo().window(wh);
                break;
            }
        }
        PimLocators.addemppagelocatorbtn();
        PimLocators.buttonlocator.click();
    }



    @Test (priority = 5)
    // Add a new employee
    public void addemployee() {
        PimLocators.addemployeelocators();
        PimLocators.firstname.sendKeys("John2");
        PimLocators.firstname.sendKeys("John2");
        PimLocators.middlename.sendKeys("Michaels2");
        PimLocators.lastname.sendKeys("Adam2");
        PimLocators.empid.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        PimLocators.empid.sendKeys("478");
        PimLocators.btnsave.click();
    }




    @Test (priority = 6)
    public void Searchforaddedemp(){
        PimLocators.locatepimpage();
        PimLocators.pimlocator.click();
        PimLocators.searchemp();
        PimLocators.searchelementbyid.sendKeys("478");
        PimLocators.searchbtn.click();
        PimLocators.afterseatch();
        Assert.assertEquals(PimLocators.searchemplocator.getText(),"(1) Record Found");
        System.out.println("employee found");
    }


    /*
    //this test looks for sucessfull search by taking a value from the table and searching for it not a hard coded value and asserts by returning message - (1) Record Found -
    @Test(priority = 7)
    public void DynamicSuccessfullSearch() throws InterruptedException{
        Baseclass.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();

        List<WebElement> idusers = Baseclass.driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[*]/div/div[2]/div"));
        for( WebElement x : idusers){
            String y = x.getText();
            if(!y.equals("Null"))
            {
                Baseclass.driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys(y);
                Baseclass.driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
                Thread.sleep(2000);
                break;
            }
            break;
        }

        String actualresult = Baseclass.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")).getText();
        Assert.assertEquals(actualresult, "(1) Record Found");
        System.out.println("Successfull search");
    }

  */
}