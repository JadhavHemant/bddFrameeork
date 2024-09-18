package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/Features",
		glue="Steps"
		)
public class RunnerTest extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		
		return super.scenarios();
	}

	
	
}
