package booking.test.runner;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;


@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/features", tags =  "@HappyPathCreate" , glue = "booking")

public class RunTest {

}