import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.southwest.com/");
		driver.close();
		
		
		String s= "s";
		String b="a";
		if (b != s) {
			System.out.println();
		}
	}
	
}
