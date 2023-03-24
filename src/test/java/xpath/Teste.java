package xpath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Teste {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(option);
//		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");

	}

}
