package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginLocators extends Pages.Baseclass {

    public static WebElement Button,username,password,failtext,requiredfield;


    public static void logindata(){
        username = Pages.Baseclass.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
        password = Pages.Baseclass.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")));
        Button = Pages.Baseclass.wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button")));
    }
    public static void wrongdata(){
        failtext = Pages.Baseclass.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")));
    }
    public static void MissingUserName(){
        requiredfield = Pages.Baseclass.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span")));
        requiredfield = Pages.Baseclass.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span")));

    }

}
