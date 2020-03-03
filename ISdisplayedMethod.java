import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISdisplayedMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://www.echoecho.com/javascript4.htm");
    System.out.println(driver.findElement(By.xpath("//input[@value='prompt box']")).isDisplayed());
}
}