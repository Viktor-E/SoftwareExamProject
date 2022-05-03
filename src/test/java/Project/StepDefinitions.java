package Project;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

	@When("Projektleder skal uddelegere en aktivitet")
	public void projektlederSkalUddelegereEnAktivitet() {
	}

	@Then("Kan projektlederen se, hvilke medarbejdere, der har tid")
	public void kanProjektlederenSeHvilkeMedarbejdereDerHarTid() {
	}

	@And("Kan give aktiviteten til en medarbejder, der er ledig")
	public void kanGiveAktivitetenTilEnMedarbejderDerErLedig() {
	}

	@Then("Vil medarbejderen få aktiviteten tildelt")
	public void vilMedarbejderenFåAktivitetenTildelt() {
	}
}

