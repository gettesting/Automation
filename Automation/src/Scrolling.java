import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public Scrolling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.thehorizontalway.com/");
		Actions action = new Actions(driver);   //actions imported
		//action.scrollByAmount(0,1500).perform();
		//Thread.sleep(2000);
		//action.scrollByAmount(0,-1500).perform();
		action.scrollByAmount(1500,0).perform();   //from left to right
		action.scrollByAmount(-1500,0).perform();  // from right to left
	}

}
