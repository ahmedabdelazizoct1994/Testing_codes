import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classRadioandCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://www.echoecho.com/htmlforms09.htm");
	int count =driver.findElements(By.xpath("//input[@type='checkbox']")).size();

    	for(int i=0;i<count;i++) {
    		driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
    		driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
    		
    		
    	}
    	
	}
	}