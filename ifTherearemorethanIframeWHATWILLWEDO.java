import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifTherearemorethanIframeWHATWILLWEDO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://demo.guru99.com/test/guru99home/");
    	
    	
    	int count=driver.findElements(By.tagName("iframe")).size();
    	System.out.println(count);
    	for(int i=0;i<count;i++) {
    		driver.switchTo().frame(i);
    	int yes=	driver.findElements(By.xpath("//img[@src='Jmeter720.png']")).size();
    	System.out.println(yes);
    	driver.switchTo().defaultContent();
    	
    	}
    	
	}}