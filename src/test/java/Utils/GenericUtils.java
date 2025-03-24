package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericUtils {
	WebDriver driver;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void m() {

		driver.findElement(By.xpath(""));
	}

	public void MultiPropertiesLoader() {

		// Create a Properties object to store merged properties
		Properties mergedProperties = new Properties();

		// Array of properties file paths
		String[] propertiesFiles = { "config1.properties", "config2.properties", "config3.properties" };

		for (String filePath : propertiesFiles) {
			try (FileInputStream fis = new FileInputStream(filePath)) {
				Properties tempProperties = new Properties();
				tempProperties.load(fis);
				mergedProperties.putAll(tempProperties);
			} catch (IOException e) {
				System.err.println("Error loading file: " + filePath);
				e.printStackTrace();
			}
		}

		// Print merged properties
		mergedProperties.forEach((key, value) -> System.out.println(key + " = " + value));

	}
}
