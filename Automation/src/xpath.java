import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public xpath() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.netflix.com/login");
driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys("x11111");
driver.findElement(By.xpath("//input[@id=':r3:']")).sendKeys("12346666");
driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
}
}