package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;

public class RedBusSteps {
	WebDriver driver;

	@Given("user open a redbus url")
	public void user_open_a_redbus_url() {
		driver = new ChromeDriver(new ChromeOptions().addArguments("--incognito"));
		driver.get("https://www.redbus.com");

	}

	@Given("validate redbus url")
	public void validate_redbus_url() throws InterruptedException {
		Assert.assertEquals(driver.getCurrentUrl().contains("redbus"), true);

		Thread.sleep(7000);
		driver.quit();
	}
}
