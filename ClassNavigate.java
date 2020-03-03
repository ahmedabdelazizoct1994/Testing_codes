import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://google.com");
    	driver.navigate().to("https://facebook.com");
    	driver.navigate().refresh();
    	driver.navigate().back();
    	driver.navigate().forward();
	}

}
