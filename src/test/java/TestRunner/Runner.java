package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
			
				features="src/test/java/FeatureFiles",
				glue="StepDefination",
				dryRun=true,
				monochrome=true
		)

public class Runner extends AbstractTestNGCucumberTests{

}
