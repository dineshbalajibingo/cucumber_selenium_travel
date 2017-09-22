package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.TestBase;
import pages.SearchPage;

public class UserStepDefinitions extends TestBase{

	SearchPage searchPage;
	
	
	@Before
	public void before()
	{
		try {
			launch();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		searchPage=PageFactory.initElements(driver, SearchPage.class);
			
		
	}
	@Given("^Open browser and hit url$")
	public void open_browser_and_hit_url() throws Throwable {
		navigatePage();
	
	}

	@When("^I select roundtrip$")
	public void selectRoundTrip() throws Throwable {
		searchPage.clickroundTrips();

	}

	@When("^Enter \"([^\"]*)\" to From field$")
	public void enterFrom(String fromLoc) throws Throwable {
		searchPage.enterFromLocation(fromLoc);
		searchPage.selectFromDropDown();
	}

	@When("^Enter \"([^\"]*)\" to destinations$")
	public void enter_to_destinations(String toLoc) throws Throwable {
		searchPage.enterToLocation(toLoc);
		searchPage.selectToDropDown();
	}

	@When("^I Enter \"([^\"]*)\"Departure Date$")
	public void enterDepartureDate(String fromDate) throws Throwable {
		searchPage.enterFromDate(fromDate);
		searchPage.generalClick();
	}

	@When("^I Enter \"([^\"]*)\"\"Return Date$")
	public void i_Enter_Return_Date(String toDate) throws Throwable {
		searchPage.enterToDate(toDate);
	}

	@When("^I select \"([^\"]*)\" adults$")
	public void enterAdults(String count) throws Throwable {
			searchPage.selectAdult();
			searchPage.clickCount(count);
			searchPage.clickPlusCancel();
	}

	@When("^User clicks on advanced search option$")
	public void clickAdvancedSearch() throws Throwable {
		searchPage.clickAllsearchOptions();
	}

	@When("^I land on to advanced search Page$")
	public void validateAdvancedSearch() throws Throwable {
		searchPage.headerText();
		System.out.println(searchPage.headerText());
		assertEquals(searchPage.headerText(), "Book a flight");
	}

	@When("^I deselect Non Stop option$")
	public void deSelectnonStop() throws Throwable {
		searchPage.selectNonStop();
	}

	@When("^I click on My search Preference$")
	public void clickSearchPreference() throws Throwable {
			searchPage.myPreference();
	}

	@When("^I enter \"([^\"]*)\" as my preferred connection$")
	public void addAirport(String name) throws Throwable {
		searchPage.addAirport(name);
	}

	@When("^I select FlexibleFares option$")
	public void addFlexibleFare() throws Throwable {
		searchPage.flexibleFares();
	}

	@When("^I select Yes for mileage earnings$")
	public void addMilage() throws Throwable {
		searchPage.milEarning();
	}

	@When("^I click on search$")
	public void clickSearch() throws Throwable {
		searchPage.searchAll();
	}

	@Then("^User should be able to search successfully$")
	public void user_should_be_able_to_search_successfully() throws Throwable {
		searchPage.goHome();
	}

	@When("^I select \"([^\"]*)\" from drop down$")
	public void flexibledays(String days) throws Throwable {
		searchPage.selectTripLength(days);
	}

	@When("^I clicks on advanced search option$")
	public void i_clicks_on_advanced_search_option() throws Throwable {
		
	}

	@When("^I select one-way$")
	public void i_select_one_way() throws Throwable {
		searchPage.clickoneWay();
	}

	@When("^I Enter number of days$")
	public void i_Enter_number_of_days() throws Throwable {

	}
	
	@When("^I click flexible dates$")
	public void clickFlexibleFare() throws Throwable {
		searchPage.datesFlexible();
	}
	
	
	
}
