package stepsDefinitions;

import com.sdatest.user.User;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class steps {

    User user;

    @When("the user with Jan name and Nowak last name is created")
    public void createUser()
    {
        user = new User("Jan", "Nowak");
    }

    @Then("welcome message should contain: {string}")
    public void assertWelcomeMessage(String text)
    {
        Assert.assertTrue(user.welcome().contains(text));
    }
}
