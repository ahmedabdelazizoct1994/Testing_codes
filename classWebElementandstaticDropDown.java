import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class classWebElementandstaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://facebook.com");
    	
    	
    //	driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/form/input")).sendKeys("ahmedddddddd");

    	
    WebElement emailbutton=	driver.findElement(By.cssSelector("input.inputtext"));
    emailbutton.sendKeys("adfghjklkjhgfdfghjk");
        WebElement day=driver.findElement(By.id("day"));
        Select dayValue=new Select(day);
      //  dayValue.selectByIndex(10);
        dayValue.selectByValue("1");
        WebElement month=driver.findElement(By.id("month"));
        Select monthValue=new Select(month);
        monthValue.selectByValue("10");

      WebElement year=  driver.findElement(By.id("year"));
      Select yearValue=new Select(year);
      yearValue.selectByIndex(1994);
    
	}

}
