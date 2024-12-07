import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoke_chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chrlauncher-win64-stable-codecs-sync");
//method to get URL :- get url
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=2781246173808382604&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303358&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
	//to maximizing screen
		driver.manage().window().maximize();		
		}
	

}
