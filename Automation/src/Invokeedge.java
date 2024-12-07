import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Invokeedge {

	public Invokeedge() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\Downloads\\edgedriver_win64");
	}

}
