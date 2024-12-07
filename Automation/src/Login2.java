import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login2 {
public Login2() {
	}
public static void main(String[] args) {
// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chrlauncher-win64-stable-codecs-sync");
//driver
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("testing@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("mmgggggg");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//how to drive a css selector tagName.className
			}
}