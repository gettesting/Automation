import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimanicdropdown {

	public Dimanicdropdown() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://rahulshettyacademy.com/dropdownPractice/");
		//click on from and inspect it
		driver.findElement(By.xpath("//input[@id='ct100_mainContent_ddl_originStation1_CTXT']")).click();
		//to insprct amritsar
		driver.findElement(By.xpath("//a[normalize-space()='Amritsar(ATQ)']")).click();
		//to click on returnfield or to field and inspect it
		driver.findElement(By.xpath("//input[@id='ct100_mainContent_ddl_destinationStation1_CTXT']")).click();
		//to click on delhi field
		driver.findElement(By.xpath("//body[1]/from[1]/[4]div"))
		}

}
