import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtab {

	public newtab() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.saucedemo.com/v1/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
	}

}
