package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.Navigation;
import pages.Search;

public class HmhTechTestStepDefinitions {

    WebDriver driver;
    private HomePage homePage;
    private Navigation navigation;
    private Search search;

    @Given("the user open the website url")
    public void the_user_open_the_website_url() {

        //Print BBC Tech Assessment
        System.out.println("BBC Tech Assessment");

        //setProperty ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C://HmhTechAssessment//chromedriver.exe");

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
    }
    @When("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        //Launch the BBC website Url
        driver.get("https://www.bbc.com/");

        //Maximize the Page (Full window Screen)
        driver.manage().window().maximize();
    }
    @Then("the user clicks on the sports section")
    public void the_user_clicks_on_the_sports_section() {
        // Write code here that turns the phrase above into concrete actions
        navigation.clickOnSportLink();
    }

    @Then("the user clicks on the News section")
    public void the_user_clicks_on_the_news_section() {
        // Write code here that turns the phrase above into concrete actions
        navigation.clickOnNewsLink();
    }
    @Then("verify the url is correct")
    public void verify_the_url_is_correct() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user clicks on search button")
    public void the_user_clicks_on_search_button() {
        // Write code here that turns the phrase above into concrete actions
        search.clickOnSearchButton();
    }
    @Then("enter the search term in search box")
    public void enter_the_search_term_in_search_box() {
        // Write code here that turns the phrase above into concrete actions
        search.searchForTerm();
    }
    @Then("click on search icon")
    public void click_on_search_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify the results are displayed")
    public void verify_the_results_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
