import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation {
	public Navigation() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chrlauncher-win64-stable-codecs-sync");
driver.get("https://secure.vidyard.com/home");
driver.navigate().to("https://bk3285491-1725690983966.atlassian.net/jira/software/projects/SCRUM/boards/1");
driver.navigate().back();    //to go to first url
driver.navigate().forward();   //to go to second url
	}

}
