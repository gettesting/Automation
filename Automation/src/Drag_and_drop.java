import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public Drag_and_drop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
			WebElement drag= driver.findElement(By.xpath("//div[@id='column-a']"));
					WebElement drop= driver.findElement(By.xpath("//div[@id='column-b']"));
					Actions action = new Actions(driver);
					action.dragAndDrop(drag, drop).perform();
	}

}
