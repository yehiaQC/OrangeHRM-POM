package Pages;

public class PimTest extends Baseclass {
/*

    @Test(priority = 4)
    // Open PIM tab in new tab and switch to the new tab, open add employee page
    public  void PImTestaddempyee() {
        Locators.PimLocators.locatepimpage();
        action.keyDown(Keys.CONTROL).moveToElement(Locators.PimLocators.pimlocator).click().perform();

        for (String wh : driver.getWindowHandles()) {
            driver.switchTo().window(wh);
            if (driver.getCurrentUrl().contains("viewEmployeeList")) {
                driver.switchTo().window(wh);
                break;
            }
        }
        Locators.PimLocators.addemppagelocatorbtn();
        Locators.PimLocators.buttonlocator.click();
    }



    @Test (priority = 5)
    // Add a new employee
    public void addemployee() {
        Locators.PimLocators.addemployeelocators();
        Locators.PimLocators.firstname.sendKeys("John2");
        Locators.PimLocators.firstname.sendKeys("John2");
        Locators.PimLocators.middlename.sendKeys("Michaels2");
        Locators.PimLocators.lastname.sendKeys("Adam2");
        Locators.PimLocators.empid.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        Locators.PimLocators.empid.sendKeys("478");
        Locators.PimLocators.btnsave.click();
    }




    @Test (priority = 6) // searching for the employee just added
    public void Searchforaddedemp(){
        Locators.PimLocators.locatepimpage();
        Locators.PimLocators.pimlocator.click();
        Locators.PimLocators.searchemp();
        Locators.PimLocators.searchelementbyid.sendKeys("478");
        Locators.PimLocators.searchbtn.click();
        Locators.PimLocators.afterseatch();
        Assert.assertEquals(Locators.PimLocators.searchemplocator.getText(),"(1) Record Found");
        System.out.println("employee found");
    }


    /*
    //this test looks for sucessfull search by taking a value from the table and searching for it not a hard coded value and asserts by returning message - (1) Record Found -
    @Test(priority = 7)
    public void DynamicSuccessfullSearch() throws InterruptedException{
        Pages.Baseclass.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();

        List<WebElement> idusers = Pages.Baseclass.driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[*]/div/div[2]/div"));
        for( WebElement x : idusers){
            String y = x.getText();
            if(!y.equals("Null"))
            {
                Pages.Baseclass.driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys(y);
                Pages.Baseclass.driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
                Thread.sleep(2000);
                break;
            }
            break;
        }

        String actualresult = Pages.Baseclass.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")).getText();
        Assert.assertEquals(actualresult, "(1) Record Found");
        System.out.println("Successfull search");
    }

  */
}