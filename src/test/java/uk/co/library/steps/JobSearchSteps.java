package uk.co.library.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {

    @Given("I am om job Search page")
    public void iAmOmJobSearchPage() {
    }


    @When("I click on accept alert cookie button")
    public void iClickOnAcceptAlertCookieButton() throws InterruptedException{
        new HomePage().acceptIFrameAlert();
    }

    @And("I click on enter job titile {string}")
    public void iClickOnEnterJobTitile(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I click on enter location  {string}")
    public void iClickOnEnterLocation(String location) {
        new HomePage().enterTheLocation(location);
    }

    @And("I click on select the distance {string}")
    public void iClickOnSelectTheDistance(String distance) {
        new HomePage().selectTheDistance(distance);
    }

    @And("I click on search option link")
    public void iClickOnSearchOptionLink() {
        new HomePage().clickOnTheSearchOptionLink();
    }

    @And("I click on enter minimum salary  {string}")
    public void iClickOnEnterMinimumSalary(String minSalary) {
        new HomePage().enterTheMinimumSalary(minSalary);
    }

    @And("I click on enter maximum salary  {string}")
    public void iClickOnEnterMaximumSalary(String maxSalary) {
        new HomePage().enterTheMaximumSalary(maxSalary);
    }

    @And("I click on enter salary type  {string}")
    public void iClickOnEnterSalaryType(String salaryType) {
        new HomePage().salaryTypeSelect(salaryType);
    }

    @And("I click on enter job type  {string}")
    public void iClickOnEnterJobType(String jobType) {
        new HomePage().jobTypeSelect(jobType);
    }

    @And("I click on find between")
    public void iClickOnFindBetween() {
        new HomePage().clickOnTheFindBtn();
    }

    @Then("I click on verify the result  {string}")
    public void iClickOnVerifyTheResult(String result) {
        Assert.assertEquals(new ResultPage().verifyTheResults(), result, "able to verify message");

    }
}

