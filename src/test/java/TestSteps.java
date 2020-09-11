import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TestSteps {
    @Given("I'm singed in as taxi driver")
    public void iMSingedInAsTaxiDriver() {
        System.out.println("Jestem zalogowany jako taksówkarz");
    }

    @When("I add photo of my car in my profile")
    public void iAddPhotoOfMyCarInMyProfile() {
    }

    @Then("Passengers will see the photo")
    public void passengersWillSeeThePhoto() {
    }

    @Given("I am {string}")
    public void iAm(String name) {
        System.out.println(name);
    }

    @When("I am {int} years old")
    public void iAmYearsOld(int age) {
        System.out.println(age);
    }

    @Then("I have {double} polish zloty in my pocket")
    public void iHavePolishZlotyInMyPocket(double arg0) {
        System.out.println(arg0);
    }

    @Given("I have {string}")
    public void iHave(String arg0) {
        if (arg0.equals("phone")) {
            System.out.println("O fajnie, ze masz telefon");
        }
    }
}
