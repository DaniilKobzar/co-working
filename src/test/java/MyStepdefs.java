import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.testng.AbstractTestNGCucumberTests;


public class MyStepdefs extends AbstractTestNGCucumberTests {
        @When("^Shredder's attack$")

    public void cucu() {
            System.out.println("hi");
        }

    @Then("Turtles defence Splinter")
    public void turtlesDefenceSplinter() {
        System.out.println("Oh, no! ");
    }
}

