package Run;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/features/search.feature",glue="steps")
public class RunCukesTest extends AbstractTestNGCucumberTests{

}
