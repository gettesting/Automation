import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Calendar {
	public Calendar() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chrlauncher-win64-stable-codecs-sync");
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//to automate departure date
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();  
driver.findElement(By.xpath("//a[normalize-space()='27']")).click();
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active ui-state-hover']")).click();
//driver.findElement(By.xpath)

	}

}
