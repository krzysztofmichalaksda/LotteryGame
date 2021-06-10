import com.sdatest.user.User;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LotterySteps {

    String name = "";
    String nazwisko = "";

    @When("wprowadzam do programu imie {string}")
    public void setName(String givenName)
    {
        name = givenName;
    }

    @When("wprowadzam do programu nazwisko {string}")
    public void setNazwisko(String givenLastName)
    {
        nazwisko = givenLastName;
    }

    @Then("program powinien przywitac mnie jako {string}")
    public void assertUserName(String nameAndLastName)
    {
        User user = new User(name, nazwisko);
        Assert.assertTrue(user.welcome().contains(nameAndLastName));
    }

    @Then("program powinien zwrocic informacje {string}")
    public void assertErrorMessage(String errorText)
    {
        User user = new User(name, nazwisko);
        Assert.assertTrue(user.welcome().contains(errorText));
    }
}
