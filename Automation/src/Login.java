import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
		public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		//to get url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.get("https://www.netflix.com/login");
		//user name
		driver.findElement(By.name("userLoginId")).sendKeys("test@gmail.com");
		//password
	    driver.findElement(By.name("password")).sendKeys("noorBal");
	    //login
	    driver.findElement(By.className("e1ax5wel2")).click();
	    System.out.println(driver.findElement(By.cssSelector("div.e191g6e31")).getText()); //when we get error message of username or password
	   		}
} 