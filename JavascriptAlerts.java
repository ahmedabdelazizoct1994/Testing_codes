import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://www.echoecho.com/javascript4.htm");
    	driver.findElement(By.xpath("//input[@value='prompt box']")).click();
	//driver.switchTo().alert().accept();
//	driver.switchTo().alert().dismiss();
	
	//System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().sendKeys("ahmedali");
	}

}
