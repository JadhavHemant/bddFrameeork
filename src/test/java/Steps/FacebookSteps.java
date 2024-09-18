package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;

public class FacebookSteps {
	WebDriver driver;

	@Given("user open a fb url")
	public void user_open_a_fb_url() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@Given("validate facebook url")
	public void validate_facebook_url() throws InterruptedException {
		Assert.assertEquals(driver.getCurrentUrl().contains("facebook"), true);

		Thread.sleep(7000);
		driver.quit();
	}

}
