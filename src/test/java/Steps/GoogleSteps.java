package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;

public class GoogleSteps {
	WebDriver driver;
	@Given("user open a google url")
	public void user_open_a_google_url() {
		driver = new EdgeDriver();
		driver.get("https://www.google.com");
	}

	@Given("validate google url")
	public void validate_google_url() throws InterruptedException {
		Assert.assertEquals(driver.getCurrentUrl().contains("google"), true);

		Thread.sleep(7000);
		driver.quit();
	}
}
