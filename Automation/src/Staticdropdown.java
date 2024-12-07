import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Staticdropdown {
public static void main(String[] args) {
// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chrlauncher-win64-stable-codecs-sync");
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
//use this syntax whose tangname is select
Select dropdown = new Select(staticdropdown);
//first method 
//dropdown.selectByVisibleText("AED");
//second method
//dropdown.selectByValue("USD");
//Third
dropdown.selectByIndex(2);
			}

}

