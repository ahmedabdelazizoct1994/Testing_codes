import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassMaxmize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://google.com");
    	driver.manage().window().maximize();
    	System.out.println(driver.getWindowHandle());
    	driver.close();
    	//driver.quit();
	}
	

}