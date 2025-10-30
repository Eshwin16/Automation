package com.cheap.stepdefinition;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.cheap.base.BaseClass;
import com.cheap.locators.Locators;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import java.sql.Driver;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.border.TitledBorder;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition extends Locators{
	
	@Given("Launch Chrome Browser and Load the URL {string}")
	public void launch_chrome_browser_and_load_the_url(String URL) {
		BaseClass.launchBrowser("Chrome");
		BaseClass.loadUrl(URL);
	    
	}

	@Then("Ensure if the Booking Page is Loaded {string}")
	public void ensure_if_the_booking_page_is_loaded(String Expectedurl) {
		String actualURL=BaseClass.PageURL();
        assertEquals("Not Matching", actualURL, Expectedurl);
        assertTrue("Both the URLs should be the same", actualURL.equals(Expectedurl));
	}
	
	
	
	/* @Given("Ticket Booking Page is Loaded {string}")
	public void ticket_booking_page_is_loaded(String Expectedurl) {
		String actualURL=BaseClass.PageURL();
        assertEquals("Not Matching", actualURL, Expectedurl);
        assertTrue("Both the URLs should be the same", actualURL.equals(Expectedurl));
        } */
	
	@Given("Able to Click Flight Tab")
	public void able_to_click_flight_tab() {
		BaseClass.ClickElement(getFlight());		
	}
	
	@Then("Validating if the Flight Tab is Selected")
	public void validating_if_the_flight_tab_is_selected() {
	    assertTrue("Flight Tab is not Selected", cls(getFlight()).contains("is-active"));
	}

	@Given("Able to Click Package Tab")
	public void able_to_click_package_tab() {
	BaseClass.ClickElement(getPackages());
	}

	@Then("Validating if the Package Tab is Selected")
	public void validating_if_the_package_tab_is_selected() {
		 assertTrue("Packages Tab is not Selected", cls(getPackages()).contains("is-active"));
	}
	
	@Given("Able to Click Hotel Tab")
	public void able_to_click_hotel_tab() {
		BaseClass.ClickElement(getHotels());	
	}

	@Then("Validating if the Hotel Tab is Selected")
	public void validating_if_the_hotel_tab_is_selected() {
		 assertTrue("Hotels Tab is not Selected", cls(getHotels()).contains("is-active"));

	}
	
	@Given("Able to Click Cars Tab")
	public void able_to_click_cars_tab() {
	   BaseClass.ClickElement(getCars());
	}

	@Then("Validating if the Cars Tab is Selected")
	public void validating_if_the_cars_tab_is_selected() {
		 assertTrue("Cars Tab is not Selected", cls(getCars()).contains("is-active"));

	}
	
	@Given("Able to Click Round Trip Radio")
	public void able_to_click_round_trip_radio() {
		BaseClass.Clickactions(getFlight());
	   BaseClass.Clickactions(getDoubleTrip());
	}

	@Then("Validdating if Round Trip Radio Got Selected")
	public void validdating_if_round_trip_radio_got_selected() {
		assertTrue("Round Trip Button Selected", BaseClass.Selected(getDoubleTrip()));
		//assertTrue("Round Trip Button Selected", BaseClass.Selected(getOneWayTrip()));
	}
	
	@Given("Able to Click One Way Radio")
	public void able_to_click_one_way_radio() {
		BaseClass.Clickactions(getFlight());
	   BaseClass.Clickactions(getOneWayTrip());
	}

	@Then("Validating if One Way Radio got Selected")
	public void validating_if_one_way_radio_got_selected() {
		//assertTrue("Round Trip Button Selected", BaseClass.Selected(getDoubleTrip()));
		assertTrue("One Way Trip Radio is not Selected", BaseClass.Selected(getOneWayTrip()));

	}
	
	@Given("Able to Click Multi City")
	public void able_to_click_multi_city() {
		BaseClass.Clickactions(getFlight());
	   BaseClass.Clickactions(getMultiCity());
	}

	@Then("Validating if Multi City Radio Got Selected")
	public void validating_if_multi_city_radio_got_selected() {
		 assertTrue("Multi City Trip Radio is not Selected", BaseClass.Selected(getMultiCity()));
	}
	
	@Given("Able to Click From Where Input Field")
	public void able_to_click_from_where_input_field() {
		BaseClass.Clickactions(getFlight());
		BaseClass.Clickactions(getDoubleTrip());
	    BaseClass.Clickactions(getFromWhere());
	}

	@Then("Validating if From Where Input Field got selected")
	public void validating_if_from_where_input_field_got_selected() {
		 assertTrue("From Where Input Box under Round Trip is not Selected", getFromWhere().equals(BaseClass.Active()));
	}
	
	@Given("Able to Click To Where Input Field")
	public void able_to_click_to_where_input_field() {
		BaseClass.Clickactions(getFlight());
		BaseClass.Clickactions(getDoubleTrip());
	   BaseClass.Clickactions(getToWhere());
	}

	@Then("Validating if to Where Input Field got selected")
	public void validating_if_to_where_input_field_got_selected() {
		 assertTrue("To Where Input Box under Ropund Trip is not Selected", getToWhere().equals(BaseClass.Active()));
	}
	
	@Given("Able to Click Depart date Field")
	public void able_to_click_depart_date_field() {
		BaseClass.Clickactions(getFlight());
		BaseClass.Clickactions(getDoubleTrip());
	    BaseClass.Clickactions(getDepart());
	}

	@Then("Validating is Depart Date Field got Selected")
	public void validating_is_depart_date_field_got_selected() {
	    assertTrue("Depart Date Field Under Round Trip is not Selected",(getDepart().equals(BaseClass.Active()))&&(BaseClass.Selected(getDoubleTrip())));
	}
	
	@Given("Able to Click Return date Field")
	public void able_to_click_return_date_field() {
	    BaseClass.Clickactions(getFlight());
	    BaseClass.Clickactions(getDoubleTrip());
	    BaseClass.Clickactions(getReturn());
	}

	@Then("Validating is Return Date Field got Selected")
	public void validating_is_return_date_field_got_selected() {
	    assertTrue("Return Date Field Under Round Trip is not Selected",(getReturn().equals(BaseClass.Active()))&&(BaseClass.Selected(getDoubleTrip())));

	}
	
	@Given("Able to Click Number of Travellers Field")
	public void able_to_click_number_of_travellers_field() {
	    BaseClass.Clickactions(getFlight());
	    BaseClass.Clickactions(getDoubleTrip());
	    BaseClass.Clickactions(getTraveller());
	}

	@Then("Validating is Number of Travellers Field got Selected")
	public void validating_is_number_of_travellers_field_got_selected() {
	    assertTrue("Number of Travellers input Field Under Round Trip is not Selected",(getTraveller().equals(BaseClass.Active()))&&(BaseClass.Selected(getDoubleTrip())));

	}
	
	@Given("Entering Words in From Field shows Suggestion Relevent to the input {string}")
	public void entering_words_in_from_field_shows_suggestion_relevent_to_the_input(String Coimb) throws InterruptedException {
		BaseClass.Clickactions(getFlight());
	    BaseClass.Clickactions(getDoubleTrip());
	    selectAll(getFromWhere());
	    Delete(getFromWhere());
	    BaseClass.InputJS(getFromWhere(), Coimb);
	    BaseClass.trigger(getFromWhere());
	    BaseClass.wait(1500);	    
	}

	@Then("Coimbatore is Listed in the Suggestion list {string}")
	public void coimbatore_is_listed_in_the_suggestion_list(String drop) {
		//BaseClass.Clickactions(getFromWhereLocation());
		assertTrue("Option is not Listed in the Drop Down", getFromWhereLocation().isDisplayed());	    
	}
	
	@Given("Able to Click the Drop Down Suggestion {string}")
	public void able_to_click_the_drop_down_suggestion(String Coimb) throws InterruptedException {
		//BaseClass.Clickactions(getFlight());
	    //BaseClass.Clickactions(getDoubleTrip());
	    //selectAll(getFromWhere());
	    //Delete(getFromWhere());
	    //BaseClass.InputJS(getFromWhere(), Coimb);
	    //BaseClass.trigger(getFromWhere());
	    //BaseClass.wait(1500);
	    BaseClass.Clickactions(getFromWhereLocation());
		}
	
	@Then("Option Rendered in the From Where input Field")
	public void option_rendered_in_the_from_where_input_field() {
	   assertTrue("CJB is not Selected",InputRenderedFrom().isDisplayed());
	}




}
