package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {

		FileInputStream fileInputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\Global.properties");
		Properties p = new Properties();
		p.load(fileInputStream);

		String QAUrl = p.getProperty("QAUrl");
		String Browser = p.getProperty("Browser");

		if (driver == null) {
			if (Browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\Cucumber\\Cucumber_TestNG\\src\\test\\resources\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(QAUrl);
			} else if (Browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "Path_of_Firefox_Driver");
				driver = new FirefoxDriver();
				driver.get(QAUrl);
			}
		}
		return driver;
	}
}
