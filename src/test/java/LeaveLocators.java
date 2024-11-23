import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LeaveLocators extends Baseclass{

    public static WebElement EmployeeName,LeaveType,Choiceinleavetype,calendar,partialdays,submitbtn,leavepagebtn,assignleavebtn,approvebtn;

    public static void locateleavepage(){
        leavepagebtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")));
    }

    public static void assignleavebtnfun(){
        assignleavebtn = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Assign Leave")));
    }
    public static void Leavelocators(){
            EmployeeName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/input[@placeholder='Type for hints...']")));
            LeaveType = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*/div[@class='oxd-select-text-input']")));
       //     Choiceinleavetype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*/div[@tabindex=0]")));
            calendar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*/input[@placeholder='yyyy-dd-mm']")));
            submitbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*/button[@type='submit']")));
       // partialdays =  wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[1]/div/div[2]/div/div/div[1]"))));
    }

    public static void aftersubmitbtn(){
        approvebtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")));
    }
}
