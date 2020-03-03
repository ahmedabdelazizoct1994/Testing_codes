import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inspecteElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://facebook.com");		
driver.findElement(By.id("email")).sendKeys("monstermonster10001000@gmail.com");
driver.findElement(By.id("pass")).sendKeys("slayerscream11slayerscream11");
//driver.findElement(By.partialLinkText("Forgotten")).click();

//driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("fuck");

	
	}

}
