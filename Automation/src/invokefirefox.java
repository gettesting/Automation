import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invokefirefox {

	public invokefirefox() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.35.0-win-aarch64");
		// TODO Auto-generated method stub

	}

}
