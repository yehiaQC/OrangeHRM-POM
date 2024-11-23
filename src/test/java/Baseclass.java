import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import javax.swing.*;
import java.io.File;
import java.time.Duration;
import java.util.Set;

public class Baseclass {

    public static WebDriver driver = new ChromeDriver();

    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public static Actions action = new Actions(driver);


    @BeforeTest
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yahmed/IdeaProjects/Digitinary2/src/test/resources/chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Shutterbug.shootPage(driver, Capture.FULL, true).save("C://Users/yahmed/IdeaProjects/OrangeHRM/src/test/resources/beforelogin.png");
    }

    /*
    @AfterTest
    public void AfterTest(){
        driver.quit();
    }
    */


}
