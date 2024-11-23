import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BuzzLocators extends Baseclass {

    public static WebElement buzzpagelocator,textareapost,sharebtn;
    public static void openbuzzpage(){
        buzzpagelocator = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a")));
    }

    public static void postlocatorfun(){
        textareapost = wait.until((ExpectedConditions.elementToBeClickable(By.tagName("textarea"))));
        sharebtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*/button[@type='submit']")));
         }

}
