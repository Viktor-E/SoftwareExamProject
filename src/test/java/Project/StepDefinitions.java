package Project;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    Main main = new Main();
    Program program = new


    

	@Then("Kan projektlederen se, hvilke medarbejdere, der har tid")
	public void kanProjektlederenSeHvilkeMedarbejdereDerHarTid() {
	}

	@And("Kan give aktiviteten til en medarbejder, der er ledig")
	public void kanGiveAktivitetenTilEnMedarbejderDerErLedig() {

	}

	@Then("Vil medarbejderen få aktiviteten tildelt")
	public void vilMedarbejderenFåAktivitetenTildelt() {

	}

    @When("En projektleder opretter en aktivitet under et projekt")
    public void enProjektlederOpretterEnAktivitetUnderEtProjekt() {

    }

    @Then("Skal projektlederen angive start og slut uge")
    public void skalProjektlederenAngiveStartOgSlutUge() {

    }

    @And("Angive forventede antal timer")
    public void angiveForventedeAntalTimer() {

    }

    @Then("Vil aktiviteten gemmes")
    public void vilAktivitetenGemmes() {

    }

    @When("En medarbejder logger ind")
    public void enMedarbejderLoggerInd() {

    }

    @Then("Kan medarbejderen se aktiviteter")
    public void kanMedarbejderenSeAktiviteter() {

    }

    @And("En medarbejder kan registrere tid på aktiviteter")
    public void enMedarbejderKanRegistrereTidPåAktiviteter() {

    }

    @And("Medarbarbejder kan logge ud")
    public void medarbarbejderKanLoggeUd() {

    }

    @When("Projektlederen åbner en projektside")
    public void projektlederenÅbnerEnProjektside() {

    }

    @Then("Projektlederen kan se aktiviteter på projektet")
    public void projektlederenKanSeAktiviteterPåProjektet() {

    }

    @And("Projektlederen kan oprette aktivitet")
    public void projektlederenKanOpretteAktivitet() {

    }

    @And("Projektlederen kan se registreret tid på aktiviteterne")
    public void projektlederenKanSeRegistreretTidPåAktiviteterne() {

    }

    @And("Projektlederen kan redigere projektet")
    public void projektlederenKanRedigereProjektet() {

    }

    @When("En medarbejder opretter et nyt projekt")
    public void enMedarbejderOpretterEtNytProjekt() {

    }

    @Then("Skal det have et navn, der ikke eksisterer i forvejen")
    public void skalDetHaveEtNavnDerIkkeEksistererIForvejen() {

    }

    @Then("Skal projektet kategoriseres som Kunde\\/Internt")
    public void skalProjektetKategoriseresSomKundeInternt() {

    }

    @And("Der skal angives starttidspunkt, hvis denne kendes")
    public void derSkalAngivesStarttidspunktHvisDenneKendes() {

    }

    @And("Der skal angives Projektleder, hvis denne kendes")
    public void derSkalAngivesProjektlederHvisDenneKendes() {

    }

    @Then("Vil projektet gemmes")
    public void vilProjektetGemmes() {

    }

    @When("Projektleder åbner projektoverblikket")
    public void projektlederÅbnerProjektoverblikket() {

    }

    @Then("åbner en side med projektstatus")
    public void åbnerEnSideMedProjektstatus() {

    }

    @Then("Kan en medarbejderen vælge en aktivitet")
    public void kanEnMedarbejderenVælgeEnAktivitet() {

    }

    @And("Medarbejderen kan ændre den angivne tid på aktiviteten")
    public void medarbejderenKanÆndreDenAngivneTidPåAktiviteten() {

    }

    @Given("At en projektleder er logget ind")
    public void atEnProjektlederErLoggetInd() {
    }

    @When("Projektlederen går ind i Manage Project i menuen")
    public void projektlederenGårIndIManageProjectIMenuen() throws ParseException {

        main.main(new String[]{""});
        System.out.println(main.program);
    }

    @Then("Projektlederen går ind i to add activity")
    public void projektlederenGårIndIToAddActivity() {
    }

    @And("Vælger hvilket projekt, der skal tilføjes an activity til")
    public void vælgerHvilketProjektDerSkalTilføjesAnActivityTil() {
    }

    @And("Giver aktiviteten et navn")
    public void giverAktivitetenEtNavn() {
    }

    @And("Angive hvilken slags activity det er")
    public void angiveHvilkenSlagsActivityDetEr() {
    }

    @And("Vælger at sætte start dato")
    public void vælgerAtSætteStartDato() {
    }

    @And("Angiver slut dato")
    public void angiverSlutDato() {
    }

    @Then("Bliver aktiviteten gemt")
    public void bliverAktivitetenGemt() {
    }

    @And("Vælger ikke at sætte start dato")
    public void vælgerIkkeAtSætteStartDato() {
    }

    @When("Projektleder skal uddelegere en aktivitet")
    public void projektlederSkalUddelegereEnAktivitet() {
    }

    @Then("Kan projektlederen se, hvilke medarbejdere, der har tid")
    public void kanProjektlederenSeHvilkeMedarbejdereDerHarTid() {
    }

    @And("Kan give aktiviteten til en ledig medarbejder")
    public void kanGiveAktivitetenTilEnLedigMedarbejder() {
    }

    @Then("Medarbejderen får aktiviteten tildelt")
    public void medarbejderenFårAktivitetenTildelt() {
    }
    
    @Given("En medarbejder er logget ind")
    public void enMedarbejderErLoggetInd() {
    }

    @Then("Skal projektet kategoriseres som Kunde\\/Internt")
    public void skalProjektetKategoriseresSomKundeInternt() {
        
    }

    @Given("Medarbejder har arbejdet i nogle timer")
    public void medarbejderHarArbejdetINogleTimer() {
        
    }

    @Then("Bliver tiden registreret i systemet")
    public void bliverTidenRegistreretISystemet() {
    }

    @And("Medarbejderen registrere timer på en aktivitet")
    public void medarbejderenRegistrereTimerPåEnAktivitet() {
    }
}

